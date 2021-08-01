package tasks58_60;

import java.util.concurrent.Callable;

public class CallableTask59 implements Callable <String> {

    @Override
    public String call() throws Exception {
        System.out.println("Another thread was executed");


      //  TimeUnit.SECONDS.sleep((int)(Math.random()*10+1));
        return Thread.currentThread().getName();
    }
}
