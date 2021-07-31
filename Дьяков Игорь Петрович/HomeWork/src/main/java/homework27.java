import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class homework27 {
    public static void main(String[]args){
        System.out.print("Введите исследуемый текст тута>>>>");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int i=0;
        Pattern p=Pattern.compile("\\S*\\w{3,}\\S*");
        Matcher m=p.matcher(text);
        while (m.find()) {i++;}
        System.out.println("количество слов>>>>"+i);

    }
}
