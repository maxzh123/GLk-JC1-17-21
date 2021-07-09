package workbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class task29 {
    public static void main(String[] args) {
        //FIXME Это сразу 2 заблуждения в одном 0x - это префикс 16-ти ричной натации в некоторых языках. Это не является частью числа. Это надо языку, чтобы он понимал что дальше число в 16-тиричной форме. а само число чаще все идет парами из 2-х знаков [0-9A-Fa-F]{2} потому что кратно 1 байт.
        String pattern = "0[xX]([1-9a-fA-F]|0(?![xX]))+";
        String input = "0x480x860x89dfh0x89BABCE0x290x510x04560fda015";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.start() + m.end () + m.group());
        }

    }
}
