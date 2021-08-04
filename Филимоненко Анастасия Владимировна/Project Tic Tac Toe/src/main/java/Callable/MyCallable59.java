package Callable;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyCallable59 implements Callable {
    @Override
    public String call() throws Exception {
        List<Integer> list = randomArrayList();
        Thread.sleep((int)(Math.random()+1000)* 5);
        String res = String.valueOf(sumList(list));
        printResult(res);
        return Thread.currentThread().getName();
    }

    private List<Integer> randomArrayList(){
        List<Integer> list=new Random().ints(1,50).limit(10).boxed().collect(Collectors.toList());
        return list;
    }
    private int  sumList(List<Integer> list){
        int sum=list.stream().mapToInt((x) -> x).sum();
        return sum;
    }
    private void printResult(String res) {
        System.out.println("Sum " + res);
    }
}
