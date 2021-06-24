
import java.util.Random;

public class Sample1 { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
     * */
    static Random r=new Random();

    String name;
    int rand;

    public Sample1(String name){
        this.name=name;
        rand=r.nextInt();
    }
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        System.out.println("Текст");  //Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
//        System.out.println("Текст");  //Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        Sample1 a=new Sample1("Первый");
        Sample1 b=new Sample1("Первый");
        System.out.println("");
    }
}
}

}
