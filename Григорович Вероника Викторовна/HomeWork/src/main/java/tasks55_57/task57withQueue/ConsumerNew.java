package tasks55_57.task57withQueue;

import java.util.ArrayDeque;

public class ConsumerNew implements Runnable{
    ArrayDeque<Integer> integerArrayDeque;

    public ConsumerNew(ArrayDeque<Integer> integerArrayDeque) {
        this.integerArrayDeque=integerArrayDeque;

    }
    @Override
    public void run() {
           synchronized (this.integerArrayDeque) {
                while (RunnerNew.countAll.get() < 1000) {
                    while (integerArrayDeque.size() == 0) {
                        try {
                            this.integerArrayDeque.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    integerArrayDeque.remove();
                    System.out.println(Thread.currentThread().getName()+" Потребитель взял товар, товаров осталось: "+integerArrayDeque.size()+" "+ RunnerNew.countAll);
                    RunnerNew.countAll.addAndGet(1);
                    this.integerArrayDeque.notify();

                }
            }
        }
    }