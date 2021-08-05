package tasks58_60;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class Task59 {
    static List<Future<String>> futures = new ArrayList<Future<String>>();
//создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел, засыпает произволно на 1-10 секунд,
// результат выполнения сумма этих чисел в виде строки.
    // запустить 10 задач параллельно в пуле из 3 потоков. вывести ход программы на экран с указанием имени потока который выполняет работу


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(new CallableTask59());
            futures.add(future);
        }


        while (futures.size() > 0) {
            Iterator<Future<String>> iterator = futures.iterator();
            while (iterator.hasNext()) {
                Future<String> stringFuture = iterator.next();
                if (stringFuture.isDone()) {
                    System.out.println("Задача завершена у потока " + stringFuture.get() + new Date());
                 iterator.remove();
                }
            }
        }
            executorService.shutdown();
        }
    }

