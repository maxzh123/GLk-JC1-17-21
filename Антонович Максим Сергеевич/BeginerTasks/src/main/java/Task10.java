import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scann.nextInt();
        System.out.println("Введите b");
        int b = scann.nextInt();
        System.out.println("Введите c");
        int c = scann.nextInt();
        System.out.println("Введите d");
        int d = scann.nextInt();
        System.out.println("Введите e");
        int e = scann.nextInt();
        System.out.println("Введите f");
        int f = scann.nextInt();
        if (P1(a,b,c,d) >= P2(e,f)) {
            System.out.println("Строй два дома");
        }else {
            System.out.println("Не строй");
        }
    }

    static  int  P1(int a, int b, int c, int d) {
        int perimeter1 = 2 * (a + b);
        int perimeter2 = 2 * (c + d);
        int summ = perimeter1 + perimeter2;
        return summ;
    }

    static int P2(int a, int b) {
        int perimeter3 = 2 * (a + b);
        return perimeter3;
    }
}
