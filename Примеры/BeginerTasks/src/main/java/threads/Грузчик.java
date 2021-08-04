package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

public class Грузчик implements Callable<String> {
    private static final AtomicLong count=new AtomicLong(1L);

    @Override
    public String call() throws Exception {
        System.out.println("Я грузчик и я начал работать");
        RunnerThreads.doSync2();
        RunnerThreads.doSync();
        RunnerThreads.doSync2();
        System.out.println("Я все сделал и забухал.");
        return "Я очень устал разгружая "+count.getAndIncrement()+"-й склад.";
    }
}
