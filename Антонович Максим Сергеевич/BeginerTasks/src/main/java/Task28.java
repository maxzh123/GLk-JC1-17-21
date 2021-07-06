import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scan.nextLine();
        Pattern regularExpression = Pattern.compile("[а-яА-Я]\\b");
        Matcher m = regularExpression.matcher(line);
        char ar;
        String summ = "";
        for (int i = 0; i < line.length();i++) {
            if (m.find()) {
                ar = line.charAt(m.start());
                String  s = String.valueOf(ar);
                summ +=s;
                System.out.print(s);
            }
        }
        System.out.println();
        System.out.print(summ);
    }
}


