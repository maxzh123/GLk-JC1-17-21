package JavaRush.task8;
// чтобы возращала true если количество дней с начала года нечетное

import java.util.Date;

public class task8_9 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean  isDateOdd(String date){
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time =currentDate.getTime()-startDate.getTime();
        long days = time /24/60/6000+1;
     return days%2==1;
    }
}
