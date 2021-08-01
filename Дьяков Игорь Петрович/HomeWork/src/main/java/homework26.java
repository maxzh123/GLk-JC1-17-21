import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class homework26 {
    public static void main(String[] arg) {
        System.out.print("Введите исследуемый текст тута>>>>");
          Scanner scanner = new Scanner(System.in);
          String text = scanner.nextLine();
        int i=0;
            Pattern p=Pattern.compile("\\p{P}");
            Matcher m=p.matcher(text);
            while (m.find()) {i++;}
        System.out.println("количество знаков препинания>>>>"+i);
    }
}

