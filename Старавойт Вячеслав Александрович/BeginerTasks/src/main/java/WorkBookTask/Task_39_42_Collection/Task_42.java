package WorkBookTask.Task_39_42_Collection;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_42 {

    static  int count = 1;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        String text = scanner.nextLine();
//        int count = 1;
        String text = "Здесь может Здесь много Здесь разных слов много ну мне хочется чтобы слов много было много";

//        Pattern pattern = Pattern.compile("[а-яЁёА-Я\\-]+[а-яА-ЯЁё]+");
//        Matcher matcher = pattern.matcher(text);
      //  Map<String, Integer> map = new HashMap<>();
        String[] words = text.split("\\s+");
        SearchCopyKey(words);
        PrintMap(map);

//            }


    }

    static Map<String, Integer> SearchCopyKey(String[] words) {
        String[] copyWords = Arrays.copyOf(words, words.length);
        List<String> copyWordsList = Arrays.asList(copyWords);   //  создали список, чтобы без проблем удалять элементы и закидывать в мапу.
        copyWordsList =new ArrayList<String>();                //  Arrays.asList() возвращает список фиксированного размера,поэтому создаем новый арэй лист и добавляем туда все старые элемены, чтобы без проблем удалять
        Collections.addAll(copyWordsList,words);
        for (int i = 0; i < copyWordsList.size(); i++) {
            for (int j = i + 1; j < copyWordsList.size(); j++) {
                if (copyWordsList.get(i).equals(copyWordsList.get(j))) {
                    count++;
                    copyWordsList.remove(j);
                    j--;
                }
            }
            map.put(copyWordsList.get(i), count);
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


