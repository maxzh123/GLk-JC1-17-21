package workbook; //

public class Task22 {
    public static void main(String[] args) {
        int[] mas = {1, 3, 4, 5, 6, 8, 10, 15, 25, 54};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
        System.out.println(); ////
        int n = mas.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = mas[n - i - 1];
            mas[n - i - 1] = mas[i];
            mas[i] = temp; // kdk
        }//
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
    }
}
