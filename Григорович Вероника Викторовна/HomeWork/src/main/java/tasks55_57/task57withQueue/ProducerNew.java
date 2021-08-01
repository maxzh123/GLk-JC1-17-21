package tasks55_57.task57withQueue;


import java.util.Queue;

public class ProducerNew implements Runnable {

    Queue<Integer> integerQueue;
    static int addRandomNumber;

    public ProducerNew(Queue<Integer> integerQueue) {
        this.integerQueue=integerQueue;

    }


    @Override
    public void run() {
        synchronized (integerQueue) {
            while (RunnerNew.countAll.get() < 10000) {
                while (integerQueue.size() >= 100) {
                    try {
                        integerQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (integerQueue.size() <= 80) {
                    addRandomNumber = (int) (Math.random() * 100 + 1);
                    integerQueue.offer(addRandomNumber);
                    RunnerNew.countAll.addAndGet(1);
                    System.out.println(Thread.currentThread().getName() + " Производитель добавил товар, итого товара: " + integerQueue.size() + " " + RunnerNew.countAll);
                    integerQueue.notify();


                }

            }
        }
    }
}
