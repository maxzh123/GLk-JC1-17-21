import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task26 {
    public static void main(String arg[]) {
        String str="Как то раз;в карибском море-захватили мы фригат,он достался нам без боя-ликовал в ту ночь,пират!";
        int n=0;

        Pattern pattern = Pattern.compile("[,.;!?-]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            n++;
        }
        System.out.println(str);
        System.out.println("Количество знаков препинания в строке - " +n);
    }
    }


