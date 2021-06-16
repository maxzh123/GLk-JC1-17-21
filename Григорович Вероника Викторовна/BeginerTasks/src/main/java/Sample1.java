/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

import java.util.Random;

public class Sample1 { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    static Random r=new Random();
    String name;
    int rand;

    public Sample1(String name, int rand){
        this.name=name;
        this.rand=r.nextInt();
    }
    public static void main (String[] arg){
        //    System.out.println("Текст")
        Sample1 a=new Sample1("Первый",11);
        Sample1 b=new Sample1("Второй",12);
        System.out.println(a.rand+a.name);
    }
}
