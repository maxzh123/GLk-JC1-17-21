package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest30 {
    public static String str = "<p>\"Когда в приемную знаменитой психиатрической клиники, \n" +
            "<p>недавно отстроенной под Москвой на берегу реки, вошел человек с острой бородкой и облаченный в белый халат, <p>\n" +
            "<p id=\"p1\">была половина второго ночи. Трое санитаров не спускали глаз с Ивана Николаевича, сидящего на диване. \n" +
            "Тут же находился и крайне взволнованный поэт Рюхин. \n" +
            "Полотенца, которыми был связан Иван Николаевич, лежали грудой на том же диване. Руки и ноги Ивана Николаевича были свободны.\"<p>";
    public static int count;

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<p.+>");//FIXME Нужен квантификатор жадности иначе эта регулярка может нати больше чем надо
        Matcher matcher = pattern.matcher(str);
        System.out.println(str.replaceAll("<p.+>", "<p>"));
        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество замен: " + count);
    }
}

