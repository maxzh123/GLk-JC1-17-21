package Tasks64_66;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task64_66 {
    static DateTimeFormatter dtf;
    static LocalDate today = LocalDate.now();

    public static void main(String[] args) {
        getData60DaysAgo();
        System.out.println();
        getCurrentDaysOfMonth();
        System.out.println();
        getWeeklyMeetings();

    }

    public static void getData60DaysAgo() { //от текущей даты вывести на экран дату, которая была 60 дней назад. Task 66
        dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String sixtyDaysAgo = dtf.format(today.minusDays(60));
        System.out.println("60 дней назад была такая дата: " + sixtyDaysAgo);
    }

    public static void getCurrentDaysOfMonth() { //вывести на экран все даты текущего месяца. Task 64

        LocalDate start = LocalDate.of(2021, 07, 1);
        LocalDate finish = start.plusMonths(1);
        LocalDate temp=start;
       while (temp.isBefore(finish)) {
           dtf = DateTimeFormatter.ofPattern("d:MMM:yyyy");
           System.out.println(dtf.format(temp));
           LocalDate newDate=temp.plusDays(1);
           temp=newDate;
        }
    }

    public static void getWeeklyMeetings() { //вывести расписание всех встреч, которые происходят еженедельно, в течение 2 месяцев Task65

        LocalDateTime start = LocalDateTime.of(2021, 07, 1, 13, 00);
        LocalDateTime finish = start.plusMonths(2);
        LocalDateTime temp=start;
        while (temp.isBefore(finish)) {
            dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HHч-mmмин");
            System.out.println("Планерка назначена на: "+dtf.format(temp));
            LocalDateTime newDate=temp.plusWeeks(1);
            temp=newDate;
        }
    }

}


