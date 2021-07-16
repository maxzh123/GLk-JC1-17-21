package JavaRush; // вот тут выводит название дней недели не на английском языке, а на русском
//а ещё тут я смотрела зоны

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task17_4_2 {
    static LocalDateTime localDateTime=LocalDateTime.of(2020, 3, 19, 9,17);
    static ZoneId zoneZulu=ZoneId.of("Zulu");
    static ZonedDateTime globalTime;
    static LocalDate date=LocalDate.of(2020,3,15);

    public static void main(String[] args) {
        globalTime=localDateTime.atZone(zoneZulu);
        System.out.println("Время в поясе Zulu: "+globalTime);
        System.out.println(getDayOfWeek(date));
        ZoneId zone= ZoneId.of("Europe/Helsinki");
        ZonedDateTime time = ZonedDateTime.now(zone);
        LocalDate localDate=time.toLocalDate();
        LocalDateTime localDateTime=time.toLocalDateTime();
        System.out.println(time);
        System.out.println(localDate);
        System.out.println(localDateTime);
    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
