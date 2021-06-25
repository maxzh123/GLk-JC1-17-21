public class Task15 {
    public static void main(String args[]) {
        int i, j;
        for (i = 50; i < 70; i++) {
            int k = 0;
            for (j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if (k < 2)
                System.out.println(i);
        }
    }
}
