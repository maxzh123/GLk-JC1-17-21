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

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            String key = "file" + item;
            File file = File.createTempFile(key, ".txt", new File("d:\\"));

            Writer writer = new OutputStreamWriter(new FileOutputStream(file));
            writer.write("123456789");
            writer.close();
            System.out.println(Thread.currentThread().getName());

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