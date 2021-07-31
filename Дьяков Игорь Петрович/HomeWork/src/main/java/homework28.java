import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class homework28 {
    public static void main(String[] args) {
        System.out.print("Введите исследуемый текст тута>>>>");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //String text= "adp wsr aei tdv wse sqt";
        Pattern p = Pattern.compile("[А-Яа-яёЁ\\w]\\b");
        Matcher m = p.matcher(text);
        StringBuffer S = new StringBuffer();
        while (m.find()) {
            String d = text.substring(m.end() - 1, m.end());
            S.append(d);
        }
        System.out.println(S);
    }
}
