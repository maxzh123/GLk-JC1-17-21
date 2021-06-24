package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class task22 { //сначала я придумала только через коллекцию
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
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            list.add(array[i]);
        }
        System.out.println(list.toString());
        }
    }

