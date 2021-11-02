//package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void convert(String xml, String json) throws IOException {
        String s = readUsingFiles(xml);
        XmlMapper mapper = new XmlMapper();
        database DB = mapper.readValue(s, database.class);
        ObjectMapper mapper2 = new ObjectMapper();
        FileWriter writer = new FileWriter(json);
        mapper2.writeValue(writer, DB);
    }

    public static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws IOException {

        //String xml = "E:/file2.xml";
        //String json = "E:/file.json";
        String xml;
        String json;
        Scanner in = new Scanner(System.in);
        xml = new String(in.nextLine());
        json = new String(in.nextLine());
        convert(xml,json);
    }
}
