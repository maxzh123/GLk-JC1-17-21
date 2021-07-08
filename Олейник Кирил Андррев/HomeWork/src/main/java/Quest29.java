import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest29 {
    public static void main(String[] args) {
        String str = "1dde8 ночь 0x1DEF улица 1e9ef фонарь 90b4c6 шестнадцатеричная система";
        Pattern pattern=Pattern.compile("(0[xX])[0-9A-F]+");
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()) {
            int start=matcher.start();
            int end= matcher.end();
            System.out.print("Шестнадцатеричное число: " + str.substring(start,end)+" ");
            System.out.println();
        }
    }
}
