package threads;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Driver implements Runnable{
//    private static final AtomicLong count=new AtomicLong(1L);
//    private long num=count.addAndGet(1);
    private static long count=1L;
    //volatile
    private static long testNumber=1L;
    private long num=count++;

    @Override
    public void run() {
        testNumber++;
        System.out.println("Я водитель №"+num+" и я поехаль."+testNumber);
        RunnerThreads.doSync();
        System.out.println("Я водитель №"+num+" и я приехаль."+testNumber);
    }
}
