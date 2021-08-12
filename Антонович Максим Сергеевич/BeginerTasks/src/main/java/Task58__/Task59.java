package Task58__;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task59 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable <List<String>> callable1 = new MyCallableForTask59();
        List<Future<List<String>>> result = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            Future<List<String>> future = executorService.submit(callable1);
            result.add(future);
        }
        for (Future<List<String>> res :result) {
            try {
                System.out.println(res.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}