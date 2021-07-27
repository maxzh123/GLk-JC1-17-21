package Task43_45;

import java.io.File;
import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) throws NegativeArraySizeException {
        arrayLength();
    }
    public static void arrayLength () throws NegativeArraySizeException {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int  arrSize = scanner.nextInt ();
        int[] array = new int[arrSize];
    }
}
