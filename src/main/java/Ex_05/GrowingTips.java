package Ex_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GrowingTips")
@XmlAccessorType(XmlAccessType.FIELD)
public class GrowingTips {
    @XmlElement(name = "Temperature")
    private int Temperature;
    @XmlElement(name = "Lighting")
    private boolean Lighting;
    @XmlElement(name = "Watering")
    private int Watering;

    public int getTemperature() {
        return Temperature;
    }

    public boolean isLighting() {
        return Lighting;
    }

    public int getWatering() {
        return Watering;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public void setLighting(boolean lighting) {
        Lighting = lighting;
    }

    public void setWatering(int watering) {
        Watering = watering;
    }
}
