package MultyTreadHomeWork;

import java.util.concurrent.Callable;

import static MultyTreadHomeWork.Task57.*;

public class Producer implements Callable {

    @Override
    public Object call()  {
        int count = 0;
        System.out.println("Поток производитель запущен " + Thread.currentThread().getName());
        while (!Task57.produceEnd) {
            if (Task57.produce) {
                if (stuffCount.addAndGet(1) > MAX_PRODUCE) {
                    System.out.println("--->  "+ stuffCount.get());//ни разу не попал на эту строку((
                    break;
                }
                int stuff = (int) (Math.random() * 100) + 1;
                AddStuff(stuff);
                count++;
            } else {
            }
            try {
                Thread.sleep((int) (Math.random() * 50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Поток производитель %s закончил работу. \n", Thread.currentThread().getName());
        return count;//Возвращаем в основной поток счетчик
    }
}

