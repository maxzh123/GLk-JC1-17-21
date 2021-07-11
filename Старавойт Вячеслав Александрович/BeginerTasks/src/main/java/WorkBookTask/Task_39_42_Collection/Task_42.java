package WorkBookTask.Task_39_42_Collection;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Задача создать мапу где ключом будет слово, а кол-во повторений в тексте значением.
public class Task_42 {

    static  int count = 1;
    static Map<String, Integer> map = new HashMap<>();
    static ArrayList<String> array =new ArrayList<String>();

    public static void main(String[] args) {
     //   StringBuilder stringBuilder =new StringBuilder();
        String text = "Здесь может Здесь много Здесь, разных. слов много! ну мне хочется чтобы слов много было много";
        Pattern pattern = Pattern.compile("[а-яЁёА-Я\\-]+[а-яА-ЯЁё]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            array.add(matcher.group());
        }
        SearchCopyKey(array);
        PrintMap(map);
     //   map.put(matcher.group(),0);
        }

//         for(int i =0; i< array.size();i++) {
//     //        for (int j = i; j < array.size(); j++) {
//                 if (map.containsKey(array.get(i))) {
//                     count++;
//                     map.put(array.get(i),count);
//                     count = 0;
//                 } else {
//                     map.put(array.get(i), number);
//                 }
//            }


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


