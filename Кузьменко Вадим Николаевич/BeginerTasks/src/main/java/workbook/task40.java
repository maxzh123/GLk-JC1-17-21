package workbook;

import java.util.Arrays;

public class task40 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 3, 5, 2, 1, 9, 10, 6, 7, 5, 1, 2, 4, 6, 6, 6, 4, 6, 1};
        boolean[] array2 = new boolean[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array2[i]) {
                int number = array[i];
                for (int j = i + 1; j < array2.length; j++) {
                    if (!array2[j]) {
                        if (number == array[j]) {
                            array2[j] = true;
                            count++;
                        }
                    }
                }
            }
        }
        int[] array3 = new int[array.length - count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array2[i]) {
                array3[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
