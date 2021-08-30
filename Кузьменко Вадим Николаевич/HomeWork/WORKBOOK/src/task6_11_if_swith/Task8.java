package task6_11_if_swith;

import java.util.Scanner;
public class Task8 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int money = scanner.nextInt();
        choosingTheCorrectCase(money);
    }
    private static void choosingTheCorrectCase(int money) {
        if (money%10==1) {
            System.out.println(money + " " + "рубль");
        } else if (money%10==2 || money%10==3 || money%10==4 ){
            System.out.println(money + " " + "рубля");
        } else {
            System.out.println(money + " " + "рублей");
        }
    }
}
