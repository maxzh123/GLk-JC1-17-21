package newDateTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class NewDateApi {
/**
 *
 * Пакет java.util.Date и java.sql.Date
 * форматирование и парсинг определены в java.text
 * не имутабл
 * нет часовых поясов, поэтому запилили java.util.Calendar с покером и java.util.TimeZone c блудницами. но они тоже не имутабл.
 * */


    public static void main(String[] args) {
        localDate();
        localTime();
        localDateTimeTest();
        instant();
    }

    static void localDate(){
        // текущая дата
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата : " + date);

        //укажем год месяц и день
         date = LocalDate.of(2021, Month.NOVEMBER, 30);
        System.out.println("Дата с параметрами : " + date);

        //с ошибкой
        //date = LocalDate.of(2021, Month.JULY, 67);

        //от начала эпохи
        date = LocalDate.ofEpochDay(365);
        System.out.println("Дата с начала эпохи : " + date);

        date = LocalDate.ofYearDay(2021, 256);
        System.out.println("256 день 2021 : " + date);
    }

    static void localTime(){
        // текущее
        LocalTime time = LocalTime.now();
        System.out.println("текущее время : " + time);

        //с использование своих данных
        time= LocalTime.of(23, 15, 11, 22);
        System.out.println("время : " + time);

        time = LocalTime.ofSecondOfDay(2000);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + time);
    }
    static void localDateTimeTest(){
        //текущее
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("текущее время : " + dateTime);

        //Из объектов
        dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime : " + dateTime);

        //из аргументов
         dateTime = LocalDateTime.of(2021, Month.JULY, 14, 11, 6, 22);
        System.out.println("с указанной датой : " + dateTime);

        //Получаем дату через 2000 секунд после 01.01.1970
         dateTime = LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + dateTime);
    }
    static void  instant(){
        Instant timestamp = Instant.now();
        System.out.println("сейчас : "+timestamp);

        //Instant для timestamp
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Instant для timestamp : " + specificTime);

        //Пример использования Duration
        Duration sixtyDay = Duration.ofDays(60);
        System.out.println(sixtyDay);
    }

    static void example() {

        LocalDate today = LocalDate.now();
        //высокосный
        System.out.println("Год " + today.getYear() + " - высокосный? : " + today.isLeapYear());

        //Сравниваем
        System.out.println("Сегодня — это до 02.06.2021? : " + today.isBefore(LocalDate.of(2021,6,2)));

        //Создаем LocalDateTime с LocalDate
        System.out.println("Текущее время : " + today.atTime(LocalTime.now()));

        //Операции + -
        System.out.println("9 дней после сегодняшнего дня будет: " + today.plusDays(9));
        System.out.println("3 недели после сегодняшнего дня будет: " + today.plusWeeks(3));
        System.out.println("20 месяцев после сегодняшнего дня будет: " + today.plusMonths(20));

        System.out.println("9 дней до сегодняшнего дня будет: " + today.minusDays(9));
        System.out.println("3 недели до сегодняшнего дня будет: " + today.minusWeeks(3));
        System.out.println("20 месяцев до сегодняшнего дня будет: " + today.minusMonths(20));

        // Выравнивания
        System.out.println("Первый день этого месяца : " + today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Последний день этой года : " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("Находим время между жвумя датами : "+period);
        System.out.println("В этом году осталось " + period.getMonths() + " месяц(ев)");
    }

    public static void parseAndFormat() {

        LocalDate date = LocalDate.now();
        // стандартный формат даты
        System.out.println("стандартный формат : " + date);
        // приименяем свой формат
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        // пользуем зашитый
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));


        LocalDateTime dateTime = LocalDateTime.now();
        //стандартный формат даты
        System.out.println("стандартный формат даты LocalDateTime : " + dateTime);
        //приименяем свой формат
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        // пользуем зашитый
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        //стандартный формат даты
        System.out.println("стандартный формат : " + timestamp);
    }
}
