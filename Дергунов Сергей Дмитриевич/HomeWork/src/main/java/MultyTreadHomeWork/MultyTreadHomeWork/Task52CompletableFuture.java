package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class Task52CompletableFuture {
    public Task52CompletableFuture(int countThread) throws InterruptedException {
        CompletableFuture<Void> longCompletableFuture = null;
        ArrayList<CompletableFuture> list = new ArrayList<>();
        for (int i = 1; i <= countThread; i++) {
            longCompletableFuture = CompletableFuture
                    .supplyAsync(CompletableFuture52::CompletableFuture)
                    .thenAcceptAsync(result -> System.out.println(result));
            }//.get не вызывается.
        Thread.sleep(5000);// дождаться результата,т.к потоки-демоны убиваются при окончании программы
    }
}