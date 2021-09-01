package examTasks.task2;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfNumbers {
    private static ArrayOfNumbers mySingleton;

    private ArrayOfNumbers() {

    }
    public static ArrayOfNumbers getMySingleton() {
        if(mySingleton==null) {
            mySingleton=new ArrayOfNumbers();
        } return mySingleton;
    }
    int [] generateArray() {
        int[] array= new Random()
                .ints(-300,300)
                .limit(10)
                .boxed()
                .mapToInt(Integer::intValue)
                .toArray();
        return array;
    }

    void findMaxAndMinElement(int [] array) {
        int indexMax=0;
        int indexMin=0;
        int max=array[0];
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>array[indexMax]) {
                max=array[i];
                indexMax=i;
            }
            if(array[i]<array[indexMin]) {
                min=array[i];
                indexMin=i;
            }
        }
        System.out.println("Максимальный элемент= "+max+", его индекс= "+indexMax);
        System.out.println("Минимальный элемент= "+min+", его индекс= "+indexMin);
        replaceMaxWithMin(array, indexMax, indexMin);
    }

    void replaceMaxWithMin(int [] array, int indexMax, int indexMin) {
        array[indexMax]=array[indexMin]*array[indexMax];
        System.out.println("Массив, в котором максимальный элемент заменен на минимальный, помноженный на минимальный: "+
                Arrays.toString(array));
    }
}
