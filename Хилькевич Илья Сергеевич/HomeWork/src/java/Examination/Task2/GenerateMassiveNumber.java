package Examination.Task2;

import java.util.Arrays;
/* Хилькевич Илья
 *
 * Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300). Число элементов массива равно 10.
 * Найти максимальное и минимальное числа в массиве и вывести на экран. Заменить максимальный элемент на минимальный, умноженный на максимальный.
 */
public class GenerateMassiveNumber {
    /*
     * Генерируется массив случайных чисел
     */
    public int[] arrayNumber;

    protected void createArray() {
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = (int) (Math.random() * 600 + 1) - 300;
        }
        System.out.println("Сгенерированный массив чисел от -300 до 300: " + Arrays.toString(arrayNumber));
    }
    /*
     * Поиск минимального числа в массиве
     */
    public int findMinElement() {
        int minElement = arrayNumber[0];
        int indexMinElement = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] < minElement) {
                minElement = arrayNumber[i];
                indexMinElement = i;
            }
        }
        System.out.println("Минимальный элемент массива= " + minElement + " ,индекс в массиве " + indexMinElement);
        return indexMinElement;
    }
    /*
     * Поиск максимального числа в массиве
     */
    public int findMaxElement() {
        int maxElement = arrayNumber[0];
        int indexMaxElement = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > maxElement) {
                maxElement = arrayNumber[i];
                indexMaxElement = i;
            }
        }
        System.out.println("Максимальный элемент массива= " + maxElement + " ,индекс в массиве " + indexMaxElement);
        return indexMaxElement;
    }
    /*
     * Поиск максимального и минимального числа в массиве с последующим умножением максимального на минимальное
     */
    public void shakeNumberElement() {
        int max = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++) {
            if (max < arrayNumber[i]) {
                max = arrayNumber[i];
            }
        }
        int min = arrayNumber[0];
        for (int m = 0; m < arrayNumber.length; m++) {
            if (min > arrayNumber[m]) {
                min = arrayNumber[m];
            }
        }
        for (int n = 0; n < arrayNumber.length; n++) {
            if (max == arrayNumber[n]) {
                arrayNumber[n] = max * min;
            }
        }
            System.out.println("Замена MAX элемента на MIN умноженный на MIN : " + Arrays.toString(arrayNumber));
        }
    }





