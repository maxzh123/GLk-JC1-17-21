package tasks58_60;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task59 {
    static List<Future<String>> futures = new ArrayList<Future<String>>();


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
           Future<String>future=executorService.submit(new CallableTask59());
       //    futures.add(future);
            System.out.println("Result: " + future.get());
        //   future.get();
        }
//futures.forEach(System.out::println);
        executorService.shutdown();
    }
}
