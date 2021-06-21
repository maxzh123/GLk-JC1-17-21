import java.util.Arrays;

public class Task_22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        reverse(array);
        }
    public static void reverse(int[] array) {
        System.out.println("Исходный массив: " + Arrays.toString(array));
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Зеркальное отображение : " + Arrays.toString(array));
    }
}
