package WorkBookTask.Task_39_42_Collection;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Задача создать мапу где ключом будет слово, а кол-во повторений в тексте значением.
public class Task_42 {


    static Map<String, Integer> map = new HashMap<>();
    /*
       static ArrayList<String> array =new ArrayList<String>();
        static int count = 1;
    */

    public static void main(String[] args) {
        String text = "Здесь может Здесь много Здесь, разных. слов много! ну мне хочется чтобы слов много было много";
        Pattern pattern = Pattern.compile("[а-яЁёА-Я\\-]+[а-яА-ЯЁё]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            // array.add(matcher.group());
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1); //увеличиваем ключ на 1 при каждом найдем совпадении
            } else {
                map.put(word, 1); // если ничо не нашли заносим ключ и значение 1
            }
        }
        PrintMap(map); //печать обычной несортированной мапы
        PrintSortMap(map); // печать сортивонной мапы
        //    SearchCopyKey(array);

    }

    static void PrintMap(Map<String, Integer> map) { // для вывода несортированной мапы.
        for (String word : map.keySet()) {
            System.out.println(word + ">>>>" + map.get(word));
        }
        System.out.println("----------------после сортировки----------------------");
    }

    static void PrintSortMap(Map<String, Integer> map) { // для вывода сортированной мапы, используем преоброзования Set ключей в массив.
        String[] words = map.keySet().toArray(new String[map.keySet().size()]); // создаем пустой массив 'words' нужной длины(map.keySet().size())
        // для тех кто не понял эту строчку сверху.Перепишем ее по другому.
        // String[] words = new String[map.keySet().size()] - пустой массив нужной нам длины
        // map.keySet().toArray(words) - передаем наше множество ключей в метод toArray, который вставит их в массив words
        Arrays.sort(words); // сортируем наш массив.
        for (String word : words) {
            System.out.println(word + ">>>>" + map.get(word));
        }
    }
}
      // второе решение, более дикое, Максим забраковал)
//    public static Map<String, Integer> SearchCopyKey(ArrayList<String> array) {
//        ArrayList<String> copyArray = new ArrayList<>(array);
//        for (int i = 0; i < copyArray.size(); i++) {
//            for (int j = i + 1; j < copyArray.size(); j++) {
//                if (copyArray.get(i).equals(copyArray.get(j))) {
//                    count++;
//                    copyArray.remove(j);
//                    j--;
//                }
//            }
//            map.put(copyArray.get(i), count);
//            count = 1;
//        }
//        return map;
//    }




