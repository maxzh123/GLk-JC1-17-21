package xml.example;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // Получение фабрики
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // Получили из фабрики билдер
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Разобрали XML, создав структуру Document.
        Document document = builder.parse(DomExample.class.getClassLoader().getResourceAsStream("example.xml"));
        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("student");
        for (int i = 0; i < employeeElements.getLength(); i++) {
            Node employee = employeeElements.item(i);
            NamedNodeMap attributes = employee.getAttributes();
            System.out.println(attributes.getNamedItem("name").getNodeValue());
        }

    }
}
