package JavaRush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    static LocalDateTime localDateTime=LocalDateTime.now();
    static ZonedDateTime zonedDateTime=ZonedDateTime.now();


    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч mмин");
        System.out.println(dtf.format(localDateTime));

        DateTimeFormatter dateTimeFormat=DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println(dateTimeFormat.format(zonedDateTime));
        DateTimeFormatter date=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate local=LocalDate.parse("01.02.2020",date);
        System.out.println(local);

    }
}
