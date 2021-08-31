package Exam.Task2;
public class RunnerT2 {

    public static void main(String[] Args) {

        Task2 sc=new Task2(10);
        System.out.print("\nМаксимальный элемент первоначального массива= "+sc.findMax());
        System.out.print("\nМинимальный элемент первоначального массива= "+sc.findMin());
        sc.change(sc.findMax(), sc.findMin(), sc.getMassive());
    }
}
