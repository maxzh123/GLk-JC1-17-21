package MultyTreadHomeWork;

import static MultyTreadHomeWork.Task57.stuffCount;

public class Producer extends java.lang.Thread {

    @Override
    public void run() {
        int count = 0;
        System.out.println("Поток производитель запущен " + getName());
        while (!Task57.produceEnd) {
            if (Task57.produce) {
                int stuff = (int) (Math.random() * 10);
                Task57.AddStuff(stuff);
                stuffCount.addAndGet(1);
                count++;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Поток производитель %s закончил работу. Произвел: %d\n", getName(), count);
    }
}

