package examTasks.task2;


import java.util.Arrays;

public class RunnerTask2 {
    public static void main(String[] args) {
        ArrayOfNumbers numbers=ArrayOfNumbers.getMySingleton();
        int [] arrays= numbers.generateArray();
        System.out.println(Arrays.toString(arrays));
        numbers.findMaxAndMinElement(arrays);
        }
    }


