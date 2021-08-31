package Task55_57_Priducer_Consumer.task57;


import java.util.ArrayDeque;

public class ProducerNew implements Runnable {

    ArrayDeque<Integer> integerArrayDeque;
    static int addRandomNumber;

    public ProducerNew(ArrayDeque<Integer> integerArrayDeque) {
        this.integerArrayDeque = integerArrayDeque;

    }


    @Override
    public void run() {
        synchronized (this.integerArrayDeque) {
            while (RunnerNew.countAll.get() < 1000) {
                while (integerArrayDeque.size() >= 100) {
                    try {
                        this.integerArrayDeque.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //     if (integerArrayDeque.size() <= 80) {
                addRandomNumber = (int) (Math.random() * 100 + 1);
                integerArrayDeque.offer(addRandomNumber);
                RunnerNew.countAll.addAndGet(1);
                System.out.println(Thread.currentThread().getName() + " Производитель добавил товар, итого товара: " + integerArrayDeque.size() + " " + RunnerNew.countAll);
                this.integerArrayDeque.notify();
            }

        }
    }
    //   }
}
