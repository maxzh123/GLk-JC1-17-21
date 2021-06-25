package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        int[] array = new int[10];
        create(array);
        System.out.println(Arrays.toString(array));
        findItemsAtEvenPositions(array);
    }

    public static void create(int[] array) {
        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите целое положительное число");
                array[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Введите целое положительное число " + e);
        }
    }
    public static void findItemsAtEvenPositions(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if(i%2==0 || i==0) {
                System.out.println("Элемент, стоящий на четной позиции " + array[i]+", позиция "+i);
            }
        }
    }
}
