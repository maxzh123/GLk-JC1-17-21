package WorkBookTask;

import java.util.Arrays;

public class Task_21 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 5, 8, 2, 3, 8, 8};
        //   for (int i = 0; i < array.length; i++) {
        // array[i] = (int) (Math.random() * 200);
        Arrays.sort(array);
        System.out.println(checkNumber(array));
    }

    public static int checkNumber(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) { //проверка на случай если минимальных значений несколько
            if (array[i] != array[i + 1]) {  // как только найдем различия в первых элементах, остальные которые совпадают заменим нулями
                for (int j = 0; j < count; j++) {
                    array[j] = 0;
                }
                break;
            } else
                count++;
        }
        // проверка на случай когда максимальных значений в массиве несколько.
        int cout = 1;
        for (int i = array.length - 1; i > 0; i--) { //проверка на случай если максимальных значений несколько
            if (array[i] != array[i - 1]) {  // как только найдем различия в последних элементах, остальные которые совпадают заменим нулями
                for (int j = array.length - 1; j > ((array.length - 1) - cout); j--) {
                    array[j] = 0;
                }
                break;
            } else
                cout++;

        }
        return Sum(array); // передадим чтобы отдельный метод посчитал сумму.
    }
    public static int Sum(int[] array){
        int sum =0;
        for (int i : array){
            sum+=i;
        }
        return sum;
    }
}
