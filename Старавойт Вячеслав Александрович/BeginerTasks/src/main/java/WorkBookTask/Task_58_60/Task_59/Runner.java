package WorkBookTask.Task_58_60.Task_59;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Runner {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallable();
        for(int i=0; i< 20; i++){ //10 задач одновременно
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                // печатаем в консоль возвращенное значение Future
                // будет задержка в 5 секунд, потому что Future.get()
                // ждет пока таск закончит выполнение
                System.out.println("Тут поток был "+ fut.get()+ "::" + new Date());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
