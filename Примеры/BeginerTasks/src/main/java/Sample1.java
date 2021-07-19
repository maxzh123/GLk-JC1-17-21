/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Sample1 { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    public static class NewNum extends Number{
        @Override
        public int intValue() {
            return 5;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
//    @SuppressWarnings("deprecation")
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        //Date d=new Date(1000L*Integer.MAX_VALUE);
         Date d=new Date();


                d.setYear(2005);
        System.out.println(d);

        Locale loc=new Locale("EN","GB");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd zzz", loc);
        System.out.println(df.format(d));
        try {
            d=df.parse("2021-06-14 MSK");
            Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("Minsk/Europe"),loc);
            cal.setTime(d);
            cal.add(Calendar.DAY_OF_MONTH,-35);
            System.out.println(cal.getTime());

        } catch (ParseException ошыпко) {
            ошыпко.printStackTrace();
        }
        System.out.println(d);
//        int a=-1;
//        print(a);
//        print(a<<1);
//        print(a>>1);
//        print(a>>>1);
//        Object x=new NewNum();
//        if ( x instanceof Number){
//            Number a=(Number) x;
//            print(a.intValue());
//        }
}

    private static void print(int x){
        System.out.print(x);
        System.out.print("\t");
        System.out.println(Integer.toBinaryString(x));
    }

}
