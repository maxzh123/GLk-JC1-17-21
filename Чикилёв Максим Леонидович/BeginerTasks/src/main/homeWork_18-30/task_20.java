import java.util.Arrays;

public class task_20 {
    public static void main(String[] args) {
        int[] array = {10, 54, 34, 87, 42, 99, 35, 67, 32, 65};
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(array) + "\n число " + max + " под индексом - " + index);
    }
}
