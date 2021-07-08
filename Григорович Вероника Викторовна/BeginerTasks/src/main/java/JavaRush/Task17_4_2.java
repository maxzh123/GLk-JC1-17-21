package JavaRush; // вот тут выводит название дней недели не на английском языке, а на русском

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task17_4_2 {
    static LocalDate date=LocalDate.of(2020,3,15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(date));
    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
