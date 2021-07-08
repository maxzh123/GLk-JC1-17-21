package JavaRush.DataAndCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date12 {
    static Calendar birthdate=new GregorianCalendar(1990, Calendar.NOVEMBER,23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthdate));
    }

    static String getDayOfWeek(Calendar birthdate) {
        String str1="";
        int day=birthdate.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "воскресенье";
            case 2:
                return "понедельник";
            case 3:
                return "вторник";
            case 4:
                return "среда";
            case 5:
                return "четверг";
            case 6:
                return "пятница";
            case 7:
                return "суббота";
        }
        return str1;

    }
}

