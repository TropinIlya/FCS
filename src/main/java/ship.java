import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;



@JacksonXmlRootElement(localName = "ship")
public class ship{
    public String name;
    public String type;
    public String lenght;

    public armor armor;
    public String speed;
    public int id;
    public String text;

}
