package WorkBookTask.Task_9_25;

import java.util.Arrays;

public class Task_20 {
    public static void main(String[] args) {
        int[] array =new int[10];
        for(int i = 0; i<array.length;i++){
            array[i]=(int) (Math.random()*200);
        }
        Arrays.sort(array);
        System.out.println("Отсортированный массив: "+Arrays.toString(array));
        System.out.println("Максимально число:"+array[9]+" под индексом 9");//так как последний элемент самый большой именно его и берем.

    }
}
