
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int e = 1; e < mas.length - 1; e++) {
            mas[e] = (int) (Math.random() * 100 + 1);

            boolean isSorted = false;
            int exc;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; e < mas.length - 1; e++) {
                    if (mas[e] > mas[e + 1]) {
                        isSorted = false;

                        exc = mas[i];
                        mas[e] = mas[i + 1];
                        mas[e + 1] = exc;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
}

