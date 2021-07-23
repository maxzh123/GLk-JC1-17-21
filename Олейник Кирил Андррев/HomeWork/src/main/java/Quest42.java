package main.java;

import java.util .*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest42 {
        static int count = 1;
        static Map<String, Integer> map = new HashMap<>();
        static ArrayList<String> array = new ArrayList<String>();
        public static void main(String[] args) {
            String text = "повторить еще разок это слово еще, комбинация ничем не связанных слов, да у меня нет фантазии, но есть слово повторить";
            Pattern pattern = Pattern.compile("[а-яА-ЯЁ-ё\\-]+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                array.add(matcher.group());
            }
            SearchCopyKey(array);
            PrintMap(map);
        }
        public static Map<String, Integer> SearchCopyKey(ArrayList<String> array) {
            ArrayList<String> copyArray = new ArrayList<>(array);
            for (int i = 0; i < copyArray.size(); i++) {
                for (int j = i + 1; j < copyArray.size(); j++) {
                    if (copyArray.get(i).equals(copyArray.get(j))) {
                        count++;
                        copyArray.remove(j);
                        j--;
                    }
                }
                map.put(copyArray.get(i), count);
                count = 1;
            }
            return map;
        }
        static void PrintMap(Map<String, Integer> map) {
            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
