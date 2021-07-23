package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class Task52CompletableFuture {
    public Task52CompletableFuture(int countThread) throws ExecutionException, InterruptedException {
        CompletableFuture<Long> longCompletableFuture = null;
        ArrayList<CompletableFuture> list = new ArrayList<>();
        for (int i = 1; i <= countThread; i++) {
            longCompletableFuture = CompletableFuture
                    .supplyAsync(CompletableFuture52::CompletableFuture);
            list.add(longCompletableFuture);
        }
        Stream<CompletableFuture> futureStream = list.stream();
        futureStream.forEach(x -> {
            try {
                System.out.println("Среднее значение: " + x.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}