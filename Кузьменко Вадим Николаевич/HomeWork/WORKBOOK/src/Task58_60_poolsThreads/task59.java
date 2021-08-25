package Task58_60_poolsThreads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.*;

// public class task58 {
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
//FIXME Я твердно уверен что оно или виснет или падает
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep((long)(Math.random() * 10000));
        int[] array;
        int sum = 0;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            for (int item : array) {
                sum = sum + item;
                System.out.println(sum + Thread.currentThread().getName());
            }
        }
        return call();
    }


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        List<Future<String>> list = new ArrayList<>();
        Callable<String>callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            Future <String> future = executor.submit(callable);
            list.add(future);
        }
        List <String> resultList = new ArrayList<>();
        for (Future <String> future : list) {
            try {
                resultList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executor.shutdown();
            System.out.println(resultList);
            countDownLatch.countDown();

        }
    }

}