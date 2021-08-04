package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunnerThreads {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor;
        //executor = Executors.newFixedThreadPool(5);
        executor = new ThreadPoolExecutor(100, 100,
                200L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1000));
        List<Future<String>> result=new ArrayList<>();
        for(int i=0;i<300;i++){
            executor.execute(new Driver());
            result.add(executor.submit (new Грузчик()));
            result.add(executor.submit (new Грузчик()));
        }
        for (Future<String> tel:result) {
            System.out.println(tel.get());
        }
        executor.shutdown();
    }

    //
    static  void doSync2(){
        try {
            TimeUnit.MILLISECONDS.sleep((int)(Math.random()*200));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static synchronized void doSync(){
        try {
            TimeUnit.MILLISECONDS.sleep((int)(Math.random()*4));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
