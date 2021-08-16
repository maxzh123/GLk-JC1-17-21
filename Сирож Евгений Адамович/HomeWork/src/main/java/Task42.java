import java.util.HashMap;

//верно
public class Task42 {
    public static String string = "пока,привет, и снова здравтвуйте,привет и привет,снова Здравствуйте";

    public static void main(String arg[]) {
        String[] str = string.split("[\\,;:—!\\.\\?\\s+]+");
        createMap(str);
    }

    public static void createMap(String[] str) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : str) {
            if (!(map.containsKey(s))) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        printMap (map);
        
    }

    private static void printMap(HashMap<String, Integer> map) {
        for (String s : map.keySet()) {
            System.out.println(s + "=>" + map.get(s));
        }
    }
    }



