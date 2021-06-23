package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        create(array);
        System.out.println(Arrays.toString(array));
        printLastElement(array);
    }
     public static void create(int [] array){
         for (int i = 0; i < array.length; i++) {
             array[i]=(int)(Math.random()*60+1);
         }
     }
    public static void printLastElement(int [] array) {
        System.out.println("Последний элемент массива "+array[array.length-1]);
    }
}
