import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;



@JacksonXmlRootElement(localName = "armor")
public class armor {
    public String scheme;
    public String surface;
    public String citadel;

}
