package Tasks74_76.JSON;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Task76StAXExample {
     /*
    программа разбирает xml файл, выводит его на экран. Каждая точка должна выводиться на отдельной строке в виде двух
    чисел разделенных запятой, при этом должна выводиться единица измерения
     */

    public static void main(String[] args) throws XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(Task76StAXExample.class.getClassLoader().getResourceAsStream("example.xml"));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("point")) {
                    System.out.print(startElement.getAttributeByName(new QName("x")).getValue()+"px"+", ");
                    System.out.print(startElement.getAttributeByName(new QName("y")).getValue()+"px");
                    System.out.println();
                }
            }
        }
    }
}

