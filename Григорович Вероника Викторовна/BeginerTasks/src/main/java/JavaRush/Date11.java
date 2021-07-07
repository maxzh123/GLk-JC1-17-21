package JavaRush;

import java.util.Calendar;
import java.util.Date;

public class Date11 {
    static Date birthDate=new Date(90, Calendar.NOVEMBER,23);;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
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

