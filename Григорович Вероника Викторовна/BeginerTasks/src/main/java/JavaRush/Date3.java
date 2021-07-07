package JavaRush;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date3 {
    public static final String INVENTED = "Пожалуйста, можете забирать";
    public static final String NOT_INVENTED = "Извините, телепорт ещё не изобрели, приходите через 10 лет";
    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 15);
    public static int count;

    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        while (!(isTeleportInvented(current))) {
            count++;
            current.add(Calendar.YEAR, 10);
    }
         System.out.println("Нам пришлось ждать примерно "+(10*count)+" лет");
}

    static boolean isTeleportInvented(Calendar current) {
        Date date = current.getTime();
        Date dateFuture = INVENTION_DAY.getTime();
        if (date.after(dateFuture)) {
            System.out.println(INVENTED);
            return true;
        } else {
            System.out.println(NOT_INVENTED);
            return false;
        }
    }
}


