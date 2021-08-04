package WorkBookTask.Task_58_60.Task_59;

import WorkBookTask.Task_52_54_Thread.Task52.Task_52;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyCallable implements Callable<String> {
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
        System.out.println("Сумма " + res);
    }
}

