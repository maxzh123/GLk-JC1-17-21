package Exam.Task2;
/*
        Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
        Число элементов массива равно 10. Найти максимальное и минимальное числа в массиве и вывести на экран.
        Заменить максимальный элемент на минимальный, умноженный на максимальный.
*/
public class Task2 {
    private final int[] massive;

    public Task2(int number){
        this.massive=new int[number];
        System.out.print("Первоначальный массив:");
        for (int i = 0; i<number;i++){
            massive [i] =(int)((Math.random()*(600+1))-300);
            System.out.print(" "+massive[i]);
        }

    }

    public int[] getMassive() {
        return massive;
    }

    public int findMax () {
        int max = massive [0];
        for (int i : massive) {
            if (max < i) {
                max = i;
            }
        } return max;
    }
    public int findMin () {
        int min= massive [0];
        for (int i : massive) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public void change(int maxvalue, int minvalue, int[]massive){
        System.out.print("\nИзмененный масив:");
        for (int k = 0; k < massive.length; k++) {
            if (maxvalue == massive [k]){
                massive [k] = maxvalue*minvalue;
            }
            System.out.print(" "+massive[k]);
            }
    }
}





