package JavaRush;

import java.time.LocalDate;

public class Task17_4_1 {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());

    }

    static LocalDate nowExample() {
        LocalDate today=LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        LocalDate date=LocalDate.of(2020, 9,12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date=LocalDate.ofYearDay(2020, 256);
        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date=LocalDate.ofEpochDay(18517);
        return date;
    }
}
