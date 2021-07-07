import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest27 {
    public static void main(String[] args){
        String str = "\"Когда в приемную знаменитой психиатрической клиники, +\n" +
        "недавно отстроенной под Москвой на берегу реки, вошел человек с острой бородкой и облаченный в белый халат, +\n" +
                "была половина второго ночи. Трое санитаров не спускали глаз с Ивана Николаевича, сидящего на диване. +\n" +
                "Тут же находился и крайне взволнованный поэт Рюхин. +\n" +
        "Полотенца, которыми был связан Иван Николаевич, лежали грудой на том же диване. Руки и ноги Ивана Николаевича были свободны.\"";
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[\\s]?[а-яА-ЯЁ-ё\\-]+[\\s]?");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            n++;
        }
        System.out.println(str);
        System.out.println("Количество слов в тексте - " +n);
    }
}
