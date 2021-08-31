package Exam;

public class ClassForTask2 {
    private int [] array;

    public ClassForTask2(int elems) {
        array = new int[elems];
    }
    public void addingValues (int values) {
        for (int i = 0; i<array.length;i++){
            array [i] = Math.abs((int) (-300 + Math.random()*300));
        }
    }
    public void print (){
        for (int i = 0;i<array.length;i++ )
            System.out.print(array [i] + ": ");
    }
    public void findMax () {
        System.out.println ();
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) {
                max = array [i];
            }
        }
        System.out.println("max: "+max);
    }
    public void findMin () {
        int min = array [0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("min: "+min);
    }
    public void change () {
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) {
                max = array [i];
            }
        }
        int min = array [0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        for (int k = 0; k < array.length; k++) {
            if (max == array [k]){
                array [k] = max*min;
            }
        }
    }
}
