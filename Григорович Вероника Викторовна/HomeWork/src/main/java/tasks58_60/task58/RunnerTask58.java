package tasks58_60.task58;


import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Создать задачу Callable, которая генерирует 10 файлоа с произвольными строками, засыпает произволно на 1-3 секунды,
//результат выполнения коллекция имен файлов (я решила сделать отдельный Generalfile и туда записать все имеющиеся файлы в папке)
//запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу

public class RunnerTask58 {
    static List<Future<String>> futureList = new ArrayList<Future<String>>();

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        fileCreator.createFile(fileCreator.file);
        fileCreator.createGeneralFile(fileCreator.generalFile);
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Future<String> future=executorService.submit(new Task58());
            futureList.add(future);

        }
        while (futureList.size() > 0) {
            Iterator<Future<String>> iterator = futureList.iterator();
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

