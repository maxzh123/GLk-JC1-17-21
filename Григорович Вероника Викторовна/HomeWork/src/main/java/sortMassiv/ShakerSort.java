package sortMassiv;

import java.util.Arrays;

public class ShakerSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        create(array);
        System.out.println(Arrays.toString(array));
        shakerSortArray(array);

    }
    public static void create(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 60 + 1);
        }
    }
    public static void shakerSortArray(int[] array) {
        int left=0;
        int right= array.length;
        while (left<right) {
        for (int i = left; i < right-1 ; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        right--;
        for (int i = right; i > left ; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        left++;
            }
        System.out.println(Arrays.toString(array));
        }
        }
