package Tasks;

import java.util.HashMap;

public class Task42 {
    static String string = "Will Will will will Will's will"; //заучивали всякую фигню, хоть где-то пригодилось

    public static void main(String[] args) {
        String[] str = string.split("[\\,\\.\\?\\s+]+");
        createMap(str);
    }

    static void createMap(String[] str) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : str) {
            if (!(map.containsKey(s))) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        printMap(map);
    }

    static void printMap(HashMap<String, Integer> map) {
        for (String s : map.keySet()) {
            System.out.println(s + "повторяется:" + map.get(s) + "раз(a)");
        }
    }
}
