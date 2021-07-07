package Arrays;

import java.util.Arrays;

public class task21 {
    public static void main(String[] args) {
        int [] array=new int[10];
        createArray(array);
        int indexMax=findMaxElement(array);
        int indexMin=findMinElement(array);
        sumBetweenMaxAndMin(array, indexMin, indexMax);
    }
    public static  void createArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1);
        }
        System.out.println(Arrays.toString(array));
        }
    public static int findMaxElement(int [] array) {
      int max=array[0];
      int indexMax=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                max=array[i];
                indexMax=i;
            }
        }
        System.out.println("Максимальный элемент массива= "+max+" , который находится под индексом "+indexMax);
        return indexMax;
    }
    public static int findMinElement(int [] array) {
        int min=array[0];
        int indexMin=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min) {
                min=array[i];
                indexMin=i;
            }
        }
        System.out.println("Минимальный элемент массива= "+min+" , который находится под индексом "+indexMin);
        return indexMin;
    }
    public static void sumBetweenMaxAndMin(int [] array, int indexMin, int indexMax) {
        int sum=0;
        if (indexMin<indexMax) {
            for (int i = indexMin+1; i < indexMax; i++) {
             sum=sum+array[i];
            }
        } else if (indexMin>indexMax) {
            for (int i = indexMin-1 ; i >indexMax ; i--) {
                sum=sum+array[i];
            }
        }
        System.out.println("Сумма элементов массива, расположенных между максимальным и минимальным элементами составляет "+sum);
    }
}

