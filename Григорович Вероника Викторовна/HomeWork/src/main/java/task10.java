import java.util.Scanner;

public class task10 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите ширину a:");
        int a = scanner.nextInt();
        System.out.print("введите длину b:");
        int b = scanner.nextInt();
        System.out.print("введите ширину c:");
        int c = scanner.nextInt();
        System.out.print("введите длину d:");
        int d = scanner.nextInt();
        System.out.print("введите ширину участка e:");
        int e = scanner.nextInt();
        System.out.print("введите длину участка f:");
        int f = scanner.nextInt();
        checkingSizeOfHouses(a,b,c,d,e,f);
    }
    public static void checkingSizeOfHouses(int a,int b,int c,int d,int e,int f) {
        if (f>=(b+d) && e>=Math.max(a,b)) {
            System.out.println("Дома поместятся на участке"); // это если дома стоят друг за другом
        } else if (e>=(a+c) && f>=Math.max(b,d)) {
            System.out.println("Дома поместятся на участке"); // это если дома располагаются на участке один над одним
        } else
        {
            System.out.println("Дома НЕ поместятся на участке");
        }
    }
}
