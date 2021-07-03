package WorkBookTask.Task_26_31_reg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_29 {
    public static int count =0;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        // String sc = scanner.nextLine();
        //Для наглядности чтобы быть уверенным что считает вставил текст.
        String simples ="0xDE 30D8A 0xFFFFFFFF";
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
         Matcher matcher = pattern.matcher(simples);
        while (matcher.find()){
           stringBuilder.append(simples.substring(matcher.start(), matcher.end()));
            stringBuilder.append("     ");
        }
        System.out.println("Найденные шестандцатиричные числа: " + stringBuilder);
    }
}
