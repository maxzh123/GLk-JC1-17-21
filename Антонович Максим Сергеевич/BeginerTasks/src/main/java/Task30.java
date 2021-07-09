import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        System.out.println(Tr("Всем привет<pid=\"p1>проба пера<pid=\"p1>"));
    }
    public static String Tr(String string1) {
        Pattern p = Pattern.compile("<?\\D{1,5}[p]\\d>?");
        Matcher m = p.matcher(string1);
        String n = string1.replaceAll(String.valueOf(p), "<p>");
        return n;
    }
}

