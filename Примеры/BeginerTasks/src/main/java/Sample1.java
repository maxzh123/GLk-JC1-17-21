/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

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
        Object x=new NewNum();
        if ( x instanceof Number){
            Number a=(Number) x;
            print(a.intValue());
        }
    }

    private static void print(int x){
        System.out.print(x);
        System.out.print("\t");
        System.out.println(Integer.toBinaryString(x));
    }

}
