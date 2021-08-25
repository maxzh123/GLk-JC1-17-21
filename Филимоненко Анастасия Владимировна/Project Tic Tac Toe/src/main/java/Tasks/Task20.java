package Tasks;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args){
        int[] array =new int[10];
        for(int i = 0; i<array.length;i++){
            array[i]=(int) (Math.random()*200);
        }
        Arrays.sort(array);
        System.out.println("Отсортированный массив: "+Arrays.toString(array));
        System.out.println("Максимальное значение:"+array[9]+" под индексом 9");
    }
}
