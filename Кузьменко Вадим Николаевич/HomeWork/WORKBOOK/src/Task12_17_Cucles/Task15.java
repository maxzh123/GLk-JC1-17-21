package Task12_17_Cucles;

public class Task15 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample6
    private static int count = 0;

    public static void main(String[] arg) { //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.

        for (int i = 50; i <= 70; i++) {//для цулочисленного i установить значение 0;выполнять блок пока i меньше 100; после каждого исполнения увеличить i на 1
            if (isPrime(i)) {// Вызываем функцию которая проверит является ли число простым если да - выводим его
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number) {
        count++;
        if (number % 2 == 0) {
            return false;
        }
        int chislo = (int) Math.sqrt(number); //из алгоритмдно из них не может превышать двоичный корень.
        for (int i = 3; i <= chislo; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
            {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        return true;
    }
}