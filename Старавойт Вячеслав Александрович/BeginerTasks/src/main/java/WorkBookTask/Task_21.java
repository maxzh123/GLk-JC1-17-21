package WorkBookTask;

import java.util.Arrays;

public class Task_21 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 4, 4, 4, 4, 7, 4, 4, 4};
        int[] MinArray = new int[]{};
        int[] MaxArray = new int[]{};
        //   for (int i = 0; i < array.length; i++) {
        // array[i] = (int) (Math.random() * 200);
        solve(array);
    }

    public static void solve(int[] arr) {
        int n = arr.length;
        int [][] sum = new int[n][n];
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < n; i++) {
            iMin = arr[i] <= arr[iMin] ? i : iMin;
            iMax = arr[i] > arr[iMax] ? i : iMax;
            sum[i][i] = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum[i][j] = sum[j][i] = sum[i][j - 1] + arr[j];
            }
        }
        System.out.println(sum[iMin][iMax]);
    }
    }
