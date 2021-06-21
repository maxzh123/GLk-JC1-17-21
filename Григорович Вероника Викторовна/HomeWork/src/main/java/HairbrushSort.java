import java.util.Arrays;

public class HairbrushSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        create(array);
        System.out.println(Arrays.toString(array));
        HairbrushSortArray(array);

    }
    public static void create(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 60 + 1);
        }
    }
    public static void HairbrushSortArray(int [] array) {
        double factor=1.247;
        double step=array.length-1;
        while (step>=1) {
            for (int i = 0; i+step < array.length; i++) {
                if (array[i]>array[i+(int)step]) {
                    int temp = array[i];
                    array[i] = array[i + (int) step];
                    array[i + (int) step] = temp;
                }
                }
            step=step/factor;
            }
        System.out.println(Arrays.toString(array));
        }
    }

