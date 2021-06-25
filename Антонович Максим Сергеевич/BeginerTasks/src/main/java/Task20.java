import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int indexMax = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(i + ": " + array[i]);
        } for (int i = 0; i < array.length; i++) {
            if (indexMax<array[i]) {
                indexMax = array [i];
            }
        }
        System.out.println("max: "+indexMax);
    }
}



