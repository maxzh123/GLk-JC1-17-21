/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */
import java.util.Random;

public class Sample1J { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
     * */

    static Random r = new Random();

    String name;
    int rand;

    public Sample1J(String name, Integer rand) {
        this.name = name;
        this.rand = r.nextInt();
    }

    public static void main(String[] arg) { //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
//        System.out.println("Текст");  //Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.


        Sample1J a = new Sample1J("Первый", 3);
        Sample1J b = new Sample1J("Второй", 15);
        System.out.println(a.toString());
        System.out.println(b.toString());


    }

    @Override
    public String toString() {
        return "Sample1J{" +
                "name='" + name + '\'' +
                ", rand=" + rand +
                '}';
    }
}
