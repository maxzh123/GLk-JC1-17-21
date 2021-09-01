package Exam.Task2;
/*
    Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
    Число элементов массива равно 10. Найти максимальное и минимальное числа в массиве и вывести на экран.
    Заменить максимальный элемент на минимальный, умноженный на максимальный.
 */
public class RunnerT2 {

    public static void main(String[] Args) {

        Task2 result=new Task2(10);
        System.out.print("\nМаксимальный элемент первоначального массива= "+result.findMax());
        System.out.print("\nМинимальный элемент первоначального массива= "+result.findMin());
        sc.change(result.findMax(), result.findMin(), result.getMassive());
    }
}
