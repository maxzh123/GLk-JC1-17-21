package tasks58_60.task58;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task58 implements Callable <String>{
    @Override
    public String call() throws Exception {
        for (int i = 0; i < fileCreator.fs.length; i++) {
            fileWriter.writeInFile(fileCreator.fs[i]);
           // TimeUnit.SECONDS.sleep((int)(Math.random()*3+1));
        }

            fileWriter.writeInGlobalFile(fileCreator.generalFile);

        return Thread.currentThread().getName();
    }
}
