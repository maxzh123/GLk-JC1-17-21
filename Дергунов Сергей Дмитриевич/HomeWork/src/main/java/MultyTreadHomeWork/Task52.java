package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class Task52 {
    public Task52(int countThread) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ArrayList<Future> list = new ArrayList<Future>();
        Callable callable = new Thread52();
        for (int i = 1; i <= countThread; i++) {
            Future future = executor.submit(callable);
            list.add(future);
        }
        Stream<Future> futureStream = list.stream();
        futureStream.forEach(x -> {
            try {
                System.out.println("Среднее значение: " + x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }
}
