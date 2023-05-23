package Ex_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Plant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plant {
    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Soil")
    private String soil;

    @XmlElement(name = "Origin")
    private String origin;

    @XmlElement(name = "VisualParameters")
    private VisualParameters visualParameters;

    @XmlElement(name = "GrowingTips")
    private GrowingTips growingTips;

    @XmlElement(name = "Multiplying")
    private String multiplying;

    public String getName() {
        return name;
    }

    public String getSoil() {
        return soil;
    }

    public String getOrigin() {
        return origin;
    }

    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setVisualParameters(VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }
}