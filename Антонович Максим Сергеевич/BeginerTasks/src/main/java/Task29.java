import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        Tr("Ягуляю0x7FFFитанцую0x5CC811D9");
    }
    public static void Tr(String string1) {
        Pattern p = Pattern.compile("0[xX]+[0-9A-F]{0,}");
        Matcher m = p.matcher(string1);
        while (m.find()) {
            System.out.println(string1.substring(m.start(), m.end()));
        }
    }
}

