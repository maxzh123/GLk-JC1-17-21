package Threads;

import java.util.Arrays;
import java.util.Random;

public class NewThread1 implements Runnable{

    static int[] numbers = new int[]{};

    @Override
    public void run() {
        int result = generationNumbersAndFindMax();
        printResult(result);

    }
    public static synchronized int generationNumbersAndFindMax(){
        numbers =  new Random().ints(0,350).limit(10).toArray();
        Integer max = Arrays.stream(numbers).max().getAsInt();
        return max;
    }
    public static synchronized void printResult(int result){
        for(Integer i:numbers){
            System.out.print("["+i+"] ");
        }
        System.out.println(Thread.currentThread().getName()+" - max element: "+result);
    }
}
