import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(sum(a,b));
    }
    private static int sum( int a, int b){
     int sumAB=(a+b)+a*b;
     return sumAB;
    }
}
