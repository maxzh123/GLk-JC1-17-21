import java.util.Scanner;

public class task8 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int many = scanner.nextInt();
        choosingTheCorrectCase(many);
    }
        private static void choosingTheCorrectCase(int many) {
            if (many%10==1) {
                System.out.println(many + "рубль");
            } else if (many%10==2 || many%10==3 || many%10==4 ){
                System.out.println(many + "рубля");
            } else {
                System.out.println(many + "рублей");
            }
            }
        }

