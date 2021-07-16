package Collections;

import java.util.HashMap;

public class Task42 {
    static String string = "кот собака. собака, кот, человек, человек! шапка, шапка... шапка";

    public static void main(String[] args) {
        String[] str = string.split("[\\,;:—!\\.\\?\\s+]+");
//        for (int i = 0; i < str.length; i++) { //проверяла как работает. ПРАВИЛЬНО ЛИ разбивает на слова
//            System.out.println(str[i]);
//        }
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
            System.out.println(s + "--->" + map.get(s));
        }
    }
}


