package Ex_05;


import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Flower")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flower {
    @XmlElement(name = "Plant")
    private List<Plant> plants;

    public Flower() throws JAXBException {
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

}