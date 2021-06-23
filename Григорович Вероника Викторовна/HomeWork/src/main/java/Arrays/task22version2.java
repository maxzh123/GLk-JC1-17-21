package Arrays;

import java.util.Arrays;

public class task22version2 { //а потом уже придумала через массив
        public static void main(String[] args) {
            int[] array = new int[10];
            create(array);
            System.out.println(Arrays.toString(array));
            reserveArray(array);
        }

        public static void create(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 60 + 1);
            }
        }
    public static void reserveArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
        }
    }

