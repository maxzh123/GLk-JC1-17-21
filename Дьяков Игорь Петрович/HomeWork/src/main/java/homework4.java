//Написать метод который принимает на вход два целых числа, делает их суммирование
//и складывает результат с произведением двух этих чисел, и возвращает полученный результат
//из метода. Передать на вход в метод любые два числа. Вывести полученный результат работы
//метода на экран.
 public class homework4 {
       public static void main (String [] args){
           int c=metod(12,35);
           System.out.print(c);
       }
       static int metod(int a,int b){
           int c=a+b+a*b;
           return c;
           }
}












