package untitled1.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int counter =0;

    public static void main(String[] args) {

        String i = "Да, я согласен, хорошо, да, ну да, конечно. :! ! Ага!? да да, !! 110 четыре!";
        Pattern pattern = Pattern.compile("[.,!?:]");
        Matcher matcher = pattern.matcher(i);
        while (matcher.find()){
            counter++;
        }

        System.out.println("Количество знаков препинания :" +counter);
    }
}