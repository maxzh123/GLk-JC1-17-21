import java.util.Arrays;

public class task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        create(array);
        System.out.println(Arrays.toString(array));
        findMaxElement(array);
    }

    public static void create(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 60 + 1);
        }
    }
    public static void findMaxElement(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) {
                max=array[i];
            }
        }
        System.out.println("Максимальный элемент массива - это "+max);
    }
}

