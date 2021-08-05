package tasks58_60.task60;

import java.util.concurrent.Callable;

public class Task60 implements Callable <String>{
    @Override
    public String call() throws Exception {
        WriterTask60.writeInFile(FileCreatorTask60.file);
        return Thread.currentThread().getName();
    }
}
