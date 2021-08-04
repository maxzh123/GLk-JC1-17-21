package Callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000); //вернуть имя потока, выполняющего вызываемую задачу
        return Thread.currentThread().getName();
    }

    public static void main(String args[]){
        //Получить ExecutorService из служебного класса Executors
        //размер пула потоков равен 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //создать список для хранения объекта Future, связанного с Callable
        List<Future> list = new ArrayList<>();
        //Create MyCallable instance
        Callable callable = new MyCallable();
        for(int i=0; i< 100; i++){
            Future future = executor.submit(callable);
            //добавив Future в список, мы можем получить возвращаемое значение
            list.add(future);
        }
        for(Future fut : list){
            try {
// выводим возвращаемое значение Future, замечаем задержку вывода в консоли
// потому что Future.get() ожидает завершения задачи
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //закрыть службу
        executor.shutdown();
    }
}
