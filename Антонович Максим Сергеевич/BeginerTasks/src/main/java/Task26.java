import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scan.nextLine();

        Pattern regularExpression = Pattern.compile("[^a-zA-Zа-яЯ-а]");
        Matcher m = regularExpression.matcher(line);
        int n = 0;
        for (int i = 0; i < line.length();i++) {
            if (m.find()) {
                n++;
            }
        }
        System.out.println(n);
    }
}
