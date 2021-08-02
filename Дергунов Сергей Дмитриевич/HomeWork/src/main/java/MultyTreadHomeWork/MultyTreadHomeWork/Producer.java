package MultyTreadHomeWork;

import java.util.concurrent.Callable;

import static MultyTreadHomeWork.Task57.*;

public class Producer implements Callable {

    @Override
    public Object call()  {
        int count = 0;
        String nameThread = Thread.currentThread().getName();
        System.out.println("Поток производитель запущен " + Thread.currentThread().getName());
        while (!produceEnd) {
            if (produce) {
                if (stuffCount.addAndGet(1) > MAX_PRODUCE) {
                    stuffCount.decrementAndGet();//
                    break;
                }
                AddStuff(stuffCount.get());
                count++;
                System.out.printf("%s --> %d в конец очереди--> положил всего-> %d\n",nameThread,stuffCount.get(),count);
            }
        }
        System.out.printf("Поток производитель %s закончил работу. \n", Thread.currentThread().getName());
        return count;//Возвращаем в основной поток счетчик
    }
}

