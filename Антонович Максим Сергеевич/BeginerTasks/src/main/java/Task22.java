
public class Task22 {
    public static void main(String[] args) {
        int[] array = {25, 15, 33, 18, 16, 15, 6, 9, 10, 11};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[(array.length-1)-i] + ", ");
//        }
//        System.out.println();
        for (int i = 0; i < array.length/2 ; i++) {
            int p = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = p;}
            for (int i =0; i < array.length ; i++){
            System.out.print(array [i] + ", ");
        }
    }
}