import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest28 {
    public static void main(String[] args) {
        String str = "\"Когда в приемную знаменитой психиатрической клиники, +\n" +
                "недавно отстроенной под Москвой на берегу реки, вошел человек с острой бородкой и облаченный в белый халат, +\n" +
                "была половина второго ночи. Трое санитаров не спускали глаз с Ивана Николаевича, сидящего на диване. +\n" +
                "Тут же находился и крайне взволнованный поэт Рюхин. +\n" +
                "Полотенца, которыми был связан Иван Николаевич, лежали грудой на том же диване. Руки и ноги Ивана Николаевича были свободны.\"";
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[а-яА-ЯЁ-ё\\-]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stringBuilder.append(str.charAt(matcher.end() - 1));
        }
            System.out.println(stringBuilder);
    }
}
