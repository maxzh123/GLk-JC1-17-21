package MultyTreadHomeWork;

import java.util.concurrent.Callable;

import static MultyTreadHomeWork.Task57.GetMyStuff;
import static MultyTreadHomeWork.Task57.stuffCountConsumer;

public class Consumer implements Callable<Integer> {

    @Override
    public Integer call()  {
        int count = 0;
        Integer temp;
        System.out.println("Поток потребитель запущен -> " + Thread.currentThread().getName());
        while (!Task57.produceEnd || Task57.GetListLength() > 0) {
            if (Task57.consume) {
                temp = GetMyStuff();
                if (( temp!= null)) {
                    stuffCountConsumer.addAndGet(1);
                    count++;
                }
            }
            try {
                Thread.sleep((int) (Math.random() * 50)+10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }
    System.out.printf("Поток потребитель %s закончил работу. \n", Thread.currentThread().getName());
        return count;//Возвращаем в основной поток счетчик
    }
}
