package Ex_05;

import javax.xml.bind.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("src/com/flowers.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Flower.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Flower flower = (Flower) jaxbUnmarshaller.unmarshal(file);


            for (Plant plant : flower.getPlants()) {
                System.out.println("Name: " + plant.getName());
                System.out.println("Soil: " + plant.getSoil());
                System.out.println("Origin: " + plant.getOrigin());

                VisualParameters visualParameters = plant.getVisualParameters();
                System.out.println("Stem Color: " + visualParameters.getStemColor());
                System.out.println("Leaf Color: " + visualParameters.getLeafColor());
                System.out.println("Size: " + visualParameters.getSize());

                GrowingTips growingTips = plant.getGrowingTips();
                System.out.println("Temperature: " + growingTips.getTemperature());
                System.out.println("Lighting: " + growingTips.isLighting());
                System.out.println("Watering: " + growingTips.getWatering());
                System.out.println("Multiplying: " + plant.getMultiplying());

                System.out.println();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}