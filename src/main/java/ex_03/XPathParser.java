package ex_03;


import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.*;
import javax.xml.xpath.*;
import java.io.*;



public class XPathParser {
    public static void main(String[] args) throws IOException, XPathExpressionException {

        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
//        XPathExpression expression = path.compile("/Flower");
//        XPathExpression expression = path.compile("/Flower/Plant");
        XPathExpression expression = path.compile("/Flower/Plant/Name");

        File xml = new File("src/com/flowers.xml");
        InputSource source = new InputSource(new FileInputStream(xml));
        Object result = expression.evaluate(source, XPathConstants.NODESET);
        NodeList list = (NodeList) result;
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println("Node name: " + node.getNodeName());
            System.out.println("Node value: " + node.getFirstChild().getNodeValue());
            System.out.println("\n");
        }
    }
}
