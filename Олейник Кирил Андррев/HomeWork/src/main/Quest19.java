package main;

public class Quest19 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 1; i < array.length; i++) {
            array[i] = (int) (Math.random() * 70 + 1);
            processNumber(array[i],i);
        }
    }

    private static void processNumber(int i, int index){
        if (index % 2 == 0) {
            System.out.println("Элемент на четной позиции № " + index + " равняется "  + i);
        }
    }
}




