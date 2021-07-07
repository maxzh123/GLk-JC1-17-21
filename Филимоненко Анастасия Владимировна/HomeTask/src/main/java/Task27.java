import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        int n =0;
        Scanner scanner = new Scanner(System.in);
        String s ="Чтобы воспитаться и не стоять ниже уровня среды, в которую попал, недостаточно прочесть Пиквика. Тут нужен беспрерывный дневной и ночной труд, вечное чтение, штудировка воли.";
        Pattern pattern = Pattern.compile("[а-яЁёА-Я0-9\\-\\_]+[а-яА-ЯЁё0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            n++;
        }
        System.out.println("Количество слов в абзаце:" +n);
    }
}
