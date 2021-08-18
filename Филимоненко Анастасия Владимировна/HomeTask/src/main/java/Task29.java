import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29{
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner =new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String s ="0xDE 30D8A 0xFFFFFFFF";
        Pattern pattern = Pattern.compile("[0-9A-F{1}][0-9A-F{1}]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            stringBuilder.append(s.substring(matcher.start(), matcher.end()));
            stringBuilder.append("     ");
        }
        System.out.println("Шеснадцатеричных чисел: " + stringBuilder);
    }
}
