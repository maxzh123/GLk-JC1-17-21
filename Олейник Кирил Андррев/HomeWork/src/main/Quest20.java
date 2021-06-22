package main;

import java.util.Arrays;

public class Quest20 {
    public static void main(String[] args) {
        int[] array =new int[10];
        for(int i = 0; i < array.length; i++){
            array[i]=(int) (Math.random()*200);
        }
        Arrays.sort(array);
        System.out.println("Сортировка чисел от меньшего к большему " + Arrays.toString(array));
        System.out.println("Наибольшее число: " +array[9]+ " , его индекс - 9");
    }
}
