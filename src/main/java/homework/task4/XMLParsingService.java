package homework.task4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLParsingService {

    public static void main(String[] args) {
        String filePath = "src\\main\\java\\homework\\task4\\students.xml";

        try {
            File inputFile = new File(filePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);
            Element root = document.getDocumentElement();
            root.normalize();
            System.out.println("Root node: " + root.getNodeName());
            NodeList nodeList = document.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nNode name: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    System.out.println("Student id: " + element.getAttribute("id"));
                    System.out.println("First name: " + element.getElementsByTagName("firstName").item(0).getTextContent());
                    System.out.println("Last name: " + element.getElementsByTagName("lastName").item(0).getTextContent());
                    System.out.println("Mark: " + element.getElementsByTagName("mark").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
