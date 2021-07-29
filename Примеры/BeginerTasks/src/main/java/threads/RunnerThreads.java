package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnerThreads {

    public static void main(String[] args) {
        ExecutorService executor;
        executor = Executors.newFixedThreadPool(20);
        for(int i=1;i<500;i++){
            executor.execute(new Driver());
        }
        executor.shutdown();
    }

    //synchronized
    static  void doSync(){
        try {
            TimeUnit.MILLISECONDS.sleep((int)(Math.random()*200));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
