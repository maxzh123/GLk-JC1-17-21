/* Задание:
1. запустить убедится, что работает.
2. изменить количество повторений.
* */

public class Sample2 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample2

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<14;i++){//для цeлочисленного i установить значение 0;выполнять блок пока i меньше 10; после каждого исполнения увеличить i на 1
            System.out.println("Повторение №"+i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
        }
    }

}
