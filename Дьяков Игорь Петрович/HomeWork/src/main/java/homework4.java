//Написать метод который принимает на вход два целых числа, делает их суммирование
//и складывает результат с произведением двух этих чисел, и возвращает полученный результат
//из метода. Передать на вход в метод любые два числа. Вывести полученный результат работы
//метода на экран.
import java.util.Scanner;
    public class homework4 {
       public static void main (String [] args)
            {  System.out.println(met(2));//??? не понимаю на что влияет значение z в скобках (z:2)
            }
       public static int met(int z)
       {
                  Scanner a1 = new Scanner(System.in);
                  System.out.print("Введите число a: ");
                  int a = a1.nextInt();
                  Scanner b1 = new Scanner(System.in);
                  System.out.print("Введите число b: ");
                  int b=b1.nextInt();
               int y;
               y =a+b;
               z=y+(a*b);
               return z;
           }
       }












