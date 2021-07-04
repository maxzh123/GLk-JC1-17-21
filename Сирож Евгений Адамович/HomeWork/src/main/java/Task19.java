
public class Task19 {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 1; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
            processNumber(array[i],i);
        }
    }

    private static void processNumber(int i, int dig){
        if (dig % 2 == 0) {
            System.out.println("четная позиции № " + dig + " = "  + i);
        }
    }
}

