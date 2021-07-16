import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        String str = "0x275B83 20xxhx8 0x5DDEF 55GOD949 0xAC234 0XABC11 ";
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








