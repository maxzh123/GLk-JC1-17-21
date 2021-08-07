package MultyTreadHomeWork;

import java.util.concurrent.Callable;

import static MultyTreadHomeWork.Task57.GetMyStuff;
import static MultyTreadHomeWork.Task57.stuffCountConsumer;

public class Consumer implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {
        int count = 0;
        String nameThread = Thread.currentThread().getName();
        Integer temp;
        System.out.println("Поток потребитель запущен -> " + Thread.currentThread().getName());
        while (!Task57.produceEnd || Task57.GetListLength() > 0) {
            if (Task57.consume) {
                temp = GetMyStuff();
                if (( temp!= null)) {
                    stuffCountConsumer.addAndGet(1);
                    count++;
                    //Thread.sleep(100);
                    System.out.printf("%s <-- %d из очереди. Взял всего -> %d \n", nameThread,temp,count);
                }
            }
       }
    System.out.printf("Поток потребитель %s закончил работу. \n", nameThread);
        return count;//Возвращаем в основной поток счетчик
    }
}
