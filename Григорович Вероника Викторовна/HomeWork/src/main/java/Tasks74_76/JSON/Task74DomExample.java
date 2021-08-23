package Tasks74_76.JSON;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class Task74DomExample {
    /*
    программа разбирает xml файл, выводит его на экран. Каждая точка должна выводиться на отдельной строке в виде двух
    чисел разделенных запятой, при этом должна выводиться единица измерения
     */

    private static ArrayList<Point> points = new ArrayList<>();
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.parse(Task74DomExample.class.getClassLoader().getResourceAsStream("example.xml"));
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("point");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodePoint = nodeList.item(i);
            NamedNodeMap map= nodePoint.getAttributes();
            points.add(new Point(map.getNamedItem("x").getNodeValue(), map.getNamedItem("y").getNodeValue()));
        }
        for (Point point: points) {
            System.out.println(String.format("Значение точки: x-%spx, y-%spx",point.getX(),point.getY()));
        }

        }

        static class Point {
        String x;
        String y;

            public Point(String x, String y) {
                this.x = x;
                this.y = y;
            }

            public String getX() {
                return x;
            }

            public String getY() {
                return y;
            }
        }
    }



