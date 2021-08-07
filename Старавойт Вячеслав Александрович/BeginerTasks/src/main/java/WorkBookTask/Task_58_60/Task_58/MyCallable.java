package WorkBookTask.Task_58_60.Task_58;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {

        return Thread.currentThread().getName();
    }
}
