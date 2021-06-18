package main;

public class Sample1 {
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        System.out.println("hello \nword");
        System.out.println("hello \tword");
        System.out.println("hello \rword");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }
}
