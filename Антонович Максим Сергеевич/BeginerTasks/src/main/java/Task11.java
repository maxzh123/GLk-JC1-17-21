import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите день с 1 по 7");
        int i = scann.nextInt();
        if (i==1) {
            System.out.println("Понедельник. Беги, Форест,беги. Тебе сегодня на работу");
        } else if (i==2) {
            System.out.println("Вторник. завтра курсы, нужно просмотреть дз");
        } else if (i==3) {
            System.out.println("Среда. Не забудь. Сегодня курсы");
        } else if (i ==4) {
            System.out.println("Четверг. еще один день (ДР)");
        } else if (i ==5) {
            System.out.println("Пятница. Еще день продержаться, да ночь простоять");
        } else if ( i ==6) {
            System.out.println("Суббота. Курсы и море - морееее");
        }else if (i==7){
            System.out.println("Воскресенье. Плачь, детка, плачь, завтра на работу");
        }else {
            System.out.println("Вы ввели числа не входящие в промежуток от 1 -7. Попробуйте еще раз");
        }
    }
}
