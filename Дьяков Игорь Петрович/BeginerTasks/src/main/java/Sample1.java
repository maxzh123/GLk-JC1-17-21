/* Задание:
1. запустить убедится, что работает.
2. внести хоть какие-то изменения, которые меняют результат. и заставить это работать.
* */

public class Sample1 { //Сообщаем компилятору что Это класс и мы дали ему имя Sample1
    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
       int z=(int)(1+Math.random()*4);
       if (z==1)
           System.out.println("попробуй еще раз;-)");
        else if (z==2)
           System.out.println("Джун должен знать все алгоритмы.\n"+"Мидл должен знать о существовании всех алгоритмов.\n"+"Сеньор должен знать где сидит джун.");  //Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        else if (z==3)
           System.out.println("Сегодня повезет");
        else if (z==4)
           System.out.println("Забавный факт-Утки способны нырять на глубину до 6 метров.");

    }

}
