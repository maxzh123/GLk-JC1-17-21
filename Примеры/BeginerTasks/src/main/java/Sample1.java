/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
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
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        Date d=new Date(1000L*Integer.MAX_VALUE);
        System.out.println(d);
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(d));
    }

    private static void print(int x){
        System.out.print(x);
        System.out.print("\t");
        System.out.println(Integer.toBinaryString(x));
    }

}
