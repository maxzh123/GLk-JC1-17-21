package MultyTreadHomeWork;


import javax.swing.*;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/*
Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно.
Есть очередь с 200 элементами. Производители добавляют случайное число от 1..100, а
потребители берут эти числа. Если в очереди элементов >= 100 производители спят, если
нет элементов в очереди – потребители спят. Если элементов стало <= 80, производители
просыпаются. Все это работает до тех пор, пока обработанных элементов не станет 10000,
только потом программа завершается.
 */
public class Task57 extends JComponent {
    public static AtomicInteger stuffCount = new AtomicInteger();
    public static AtomicInteger stuffCountConsumer = new AtomicInteger();
    int countProducer = 3;
    int countConsumer = 2;
    static private LinkedList<Integer> list;
    static boolean produce = false;
    static boolean consume = true;
    static boolean produceEnd = false;

    public Task57() {
        list = new LinkedList<>();
        String nameTread;
        for (int i = 1; i <= countProducer; i++) {
            Producer t = new Producer();
            nameTread = "Producer thread " + i;
            t.setName(nameTread);
            System.out.println("Создан поток производитель: " + nameTread);
            t.start();
        }
        System.out.println("-------------------------------------");
        for (int i = 1; i <= countConsumer; i++) {
            Consumer t = new Consumer();
            nameTread = "Consumer thread " + i;
            t.setName(nameTread);
            System.out.println("Создан поток потребитель: " + nameTread);
            t.start();
        }
        System.out.println("--------------------------------------");
        while (true) {
            //System.out.printf("В очереди: %d - произведено: %d - потреблено: %d\n", list.size(), stuffCount.get(), stuffCountConsumer.get());
            if (list.size() > 100) produce = false;
            if (list.size() < 80) produce = true;
            if (stuffCount.get() >= 1000) {
                produceEnd = true;
                break;
            }
        }
    }

    public static synchronized void AddStuff(int stuff) {
        Task57.list.addLast(stuff);
    }

    public static synchronized boolean GetMyStuff() {
        if (list.isEmpty()) return false;
        Task57.list.removeFirst();
        return true;
    }

    public static int GetListLength() {
        return list.size();
    }
}

