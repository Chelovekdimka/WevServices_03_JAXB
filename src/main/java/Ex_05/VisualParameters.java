package Ex_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VisualParameters")
@XmlAccessorType(XmlAccessType.FIELD)
public class VisualParameters {
    @XmlElement(name = "StemColor")
    private String StemColor;
    @XmlElement(name = "LeafColor")
    private String LeafColor;
    @XmlElement(name = "Size")
    private String Size;

    public String getStemColor() {
        return StemColor;
    }

    public String getLeafColor() {
        return LeafColor;
    }

    public String getSize() {
        return Size;
    }

    public void setStemColor(String stemColor) {
        StemColor = stemColor;
    }

    public void setLeafColor(String leafColor) {
        LeafColor = leafColor;
    }

    public void setSize(String size) {
        Size = size;
    }
}

