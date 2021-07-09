import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Quest26 {
    public static void main(String[] args){
        String str = "Да, человек смертен, но это было бы еще полбеды. Плохо то, что он иногда внезапно смертен, вот в чем фокус!";
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[,.!?/ ]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            n++;
        }
        System.out.println(str);
        System.out.println("Количество знаков препинания и пробелов в строке - " +n);
    }
}
