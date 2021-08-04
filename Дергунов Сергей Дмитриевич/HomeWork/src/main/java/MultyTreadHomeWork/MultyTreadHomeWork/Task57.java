package MultyTreadHomeWork;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/*
Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100, а
потребители берут эти числа. Если в очереди элементов >= 100 производители спят, если
нет элементов в очереди – потребители спят. Если элементов стало <= 80, производители
просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000,
только потом программа завершается.
 */
public class Task57 extends JComponent {
    public static final AtomicInteger stuffCount = new AtomicInteger();
    public static final AtomicInteger stuffCountConsumer = new AtomicInteger();
    int countProducer = 4;
    int countConsumer = 2;
    static private Queue<Integer> queue = null;
    volatile static boolean produce = false;
    static boolean consume = true;
    volatile static boolean produceEnd = false;
    static final int MAX_PRODUCE=1000;

    public Task57() {
        queue = new ConcurrentLinkedDeque<>();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        ArrayList<Future> listProducers = new ArrayList<>();

        for (int i = 1; i <= countProducer; i++) {
            Callable callableProducer = new Producer();
            System.out.println("Создан поток производитель: "+i);
            Future future = executor.submit(callableProducer);
            listProducers.add(future);//если надо, потом можем обработать счетчики
        }
        System.out.println("-------------------------------------");

        ArrayList<Future> listConsumers = new ArrayList<>();
        for (int i = 1; i <= countConsumer; i++) {
            Callable callableConsumer = new Consumer();
            System.out.println("Создан поток потребитель: " + i);
            Future future = executor.submit(callableConsumer);
            listConsumers.add(future);//если надо, потом можем обработать счетчики
        }
        System.out.println("--------------------------------------");

        while (true) {
          //  System.out.printf("В очереди: %d - произведено: %d - потреблено: %d\n", queue.size(), stuffCount.get(), stuffCountConsumer.get());
            if (queue.size() > 100) {
                produce = false;}
            if (queue.size() < 80) {
                produce = true;
              }
            if (stuffCount.get() >= MAX_PRODUCE) {
                produceEnd = true;
                if(queue.size()==0){
                break;}
            }
        }
        executor.shutdown();

        Stream<Future> streamProducers = listProducers.stream();
        streamProducers.forEach(x -> {
            try {
                System.out.println("Поток произвел:" + x.get());
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        Stream<Future> streamConsumers = listConsumers.stream();
        streamConsumers.forEach(x -> {
            try {
                System.out.println("Поток потребил:" + x.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println("--------------------------------------------");
        System.out.printf("Итого произведено: %d\n",stuffCount.get());
        System.out.printf("Итого потреблено: %d\n",stuffCountConsumer.get());


    }

    public static void AddStuff(int stuff) {
        queue.add(stuff);
    }

    public static Integer GetMyStuff() {
       return queue.poll();
    }

    public static int GetListLength() {
        return queue.size();
    }
}

