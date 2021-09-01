package task26_31_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class task29 {
    public static void main(String[] args) {
        String pattern = "0[xX]([1-9a-fA-F]|0(?![xX]))+";
        String input = "0x480x860x89dfh0x89BABCE0x290x510x04560fda015";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.start() + m.end () + m.group());
        }

    }
}