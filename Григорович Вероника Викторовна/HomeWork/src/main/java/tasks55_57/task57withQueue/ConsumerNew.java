package tasks55_57.task57withQueue;

import java.util.Queue;

public class ConsumerNew implements Runnable{
    Queue<Integer> integerQueue;

    public ConsumerNew(Queue<Integer> integerQueue) {
        this.integerQueue=integerQueue;

    }
    @Override
    public void run() {
            synchronized (integerQueue) {
                while (RunnerNew.countAll.get() < 10000) {
                    while (integerQueue.size() == 0) {
                        try {
                            integerQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    integerQueue.remove();
                    System.out.println(Thread.currentThread().getName()+" Потребитель взял товар, товаров осталось: "+integerQueue.size()+" "+ RunnerNew.countAll);
                    RunnerNew.countAll.addAndGet(1);;
                    integerQueue.notify();
                }
            }
        }
    }