package Exception.task44;

import java.util.Scanner;

public class TestClass {
    static Scanner scanner=new Scanner(System.in);

    static public void checkNumbers() {
        System.out.println("Введите число ");
        try {
            int bomba=scanner.nextInt();
            if (bomba==666) {
                throw new Exception();
            }
            System.out.println("Ничего не произошло");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
