import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "database")
public class database {
    @JacksonXmlElementWrapper(localName = "ships")
    @JacksonXmlProperty(localName = "ships")
    public List<ship> ships;
    @JacksonXmlElementWrapper(localName = "fighters")
    @JacksonXmlProperty(localName = "fighters")
    public List<fighter> fighters;
}
