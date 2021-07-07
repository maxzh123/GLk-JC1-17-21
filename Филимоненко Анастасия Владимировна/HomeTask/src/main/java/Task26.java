import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        String str = "Воспитанные люди уважают человеческую личность, а потому всегда снисходительны, мягки, вежливы. Они сострадательны не к одним только нищим и кошкам. Они болеют душой и от того, чего не увидишь простым глазом.";
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[,.]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            n++;
        }
System.out.println(str);
        System.out.println("Количество запятых и  точек в абзаце:" +n);
    }
}