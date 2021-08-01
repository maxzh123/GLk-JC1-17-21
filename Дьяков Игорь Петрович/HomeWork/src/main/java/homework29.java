import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class homework29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите исследуемый текст тута>>>>");
        String text = s.nextLine();
        //String text="0x7FFA 0x80 0x7F 00xxX 0Xx0 few1 13425";
        Pattern p=Pattern.compile("(0[xX])[0123456789ABCDEF]+");
        Matcher m=p.matcher(text);
    while (m.find()){
        System.out.println("16тиричное число>>>>"+text.substring(m.start(), m.end())+" ");
       }
   }
}
