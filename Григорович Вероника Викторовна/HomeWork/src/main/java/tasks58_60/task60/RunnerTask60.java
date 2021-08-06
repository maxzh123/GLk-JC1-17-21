package tasks58_60.task60;



import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static tasks58_60.task60.FileCreatorTask60.createNewFile;
//создать задачу Callable, которая берет сообщение "Hello World" + текущее время и записывает его в файл.
// Запись в файл должна производиться последовательно через синхронизированный метод.
// Запустить 10 задач параллельно в пуле из 3 потоков.
public class RunnerTask60 {
    static List<Future<String>> future1 = new ArrayList<Future<String>>();


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        createNewFile(FileCreatorTask60.file);
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Future<String>future=executorService.submit(new Task60());
            future1.add(future);
        }
        for (Future<String> future:future1) {
            System.out.println("Работает поток " + future.get());
        }
        executorService.shutdown();
    }
}
