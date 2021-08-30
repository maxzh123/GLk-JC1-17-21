package WorkBookTask.Task_74_76;


import org.xml.sax.SAXException;


import javax.xml.parsers.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import java.io.IOException;


public class Task_74 {


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(Task_74.class.getClassLoader().getResourceAsStream("ex.xml"));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("x")) {
                    System.out.printf( "Координаты точки:%spx,",reader.getElementText());
                }
                else if (startElement.getName().getLocalPart().equals("y")) {
                    System.out.printf( "%spx;"+"\n",reader.getElementText());
                }
            }
        }

    }

}






