import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        while (name.hasNextInt()) {
            int amountOfMoney = name.nextInt();
            if (amountOfMoney % 10 == 1)
                System.out.println(amountOfMoney + " рубль");
            else if (amountOfMoney % 10 == 2 || amountOfMoney % 10 == 3 || amountOfMoney % 10 == 4)
                System.out.println(amountOfMoney + " рубля");
            else
                System.out.println(amountOfMoney + " рублей");

        }
    }
}

