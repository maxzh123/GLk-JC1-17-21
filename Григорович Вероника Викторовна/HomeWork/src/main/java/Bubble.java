import java.util.Arrays;

public class Bubble {
    public static void main (String [] args) {
        int [] array=new int[20];
        printArray(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    /* Если бы этот метод назывался DestroyGalaxy мы хотя бы понимали-бы что вы шутите :-)
    * */
    public static void printArray(int [] arrays){
        for (int i = 0; i < arrays.length ; i++) {
            arrays[i]=(int)(Math.random()*50);
        }
    }
    public static void bubbleSort(int [] arrays) {
        int temp;
        for (int i = arrays.length-1; i >=0 ; i--)
        {
            for (int j = 0; j < arrays.length-1; j++) {
                if (arrays[j]>arrays[j+1]) {
                    temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                }
            }
        }
    }

}
