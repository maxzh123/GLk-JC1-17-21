package MultyTreadHomeWork;

import java.util.concurrent.Callable;

import static MultyTreadHomeWork.Task57.*;

public class Producer implements Callable <Integer> {

    @Override
    public Integer call() throws InterruptedException {
        int count = 0;
        String nameThread = Thread.currentThread().getName();
        System.out.println("Поток производитель запущен " + Thread.currentThread().getName());
        while (!produceEnd) {
            if (produce.get()) {
                if (stuffCount.addAndGet(1) > MAX_PRODUCE) {
                    stuffCount.decrementAndGet();//
                    break;
                }
                AddStuff(stuffCount.get());
                count++;
                System.out.printf("%s --> %d в конец очереди--> положил всего-> %d\n", nameThread, stuffCount.get(), count);
                } else {
                synchronized (produce) {
                    System.out.println("Поток продюсер пошел спать!");
                    produce.wait();
                }
            }
        }
        System.out.printf("Поток производитель %s закончил работу. \n", Thread.currentThread().getName());
        return count;//Возвращаем в основной поток счетчик
    }
}

