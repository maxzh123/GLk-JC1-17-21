package task57Example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    public static final int LIMIT=1000;

    public static void main(String[] args) {
        final int prodCount=3;
        final int consCount=2;
        DummyQueue q=new DummyQueue();
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(prodCount+consCount);
        for(int i=0;i<prodCount;i++){
            executor.execute(new Producer(q));
        }
        for(int i=0;i<consCount;i++){
            executor.execute(new Consumer(q));
        }
        executor.shutdown();
    }

}
