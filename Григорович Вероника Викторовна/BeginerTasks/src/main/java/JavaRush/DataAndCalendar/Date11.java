package JavaRush.DataAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date11 {
    static Date birthDate=new Date(90, Calendar.NOVEMBER,23);
    static Locale rus=new Locale("ru", "RU");
    static SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MMMM-dd, EEEE", rus);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
        System.out.println(formatter.format(birthDate.getTime()));
    }

    static String getDayOfWeek(Date birthDate) {
        String str="";
        int day=birthDate.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return str;
    }
}

