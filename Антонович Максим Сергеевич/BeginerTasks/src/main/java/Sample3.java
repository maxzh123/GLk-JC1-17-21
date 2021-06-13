/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает
3. поменять функцию обработчик так, чтобы она выводила только числа которые делятся на 3
* */

public class Sample3 {   //Сообщаем компилятору что Это класс и мы дали ему имя Sample3

    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            processNumber (i);
        }
    }
    private static void processNumber (int num){
        if (num%3==0){
            System.out.println(num+" данное число на 3 делится");
        }else {
            System.out.println(num+" данное число на 3 не делится");
        }
    }
}
