package MultyTreadHomeWork;

import static MultyTreadHomeWork.Task57.stuffCountConsumer;

public class Consumer extends java.lang.Thread {

    @Override
    public void run() {
        int count = 0;
        System.out.println("Поток потребитель запущен -> " + getName());
        while (!Task57.produceEnd||Task57.GetListLength()>0) {
            if (Task57.consume) {
                if (Task57.GetMyStuff()) {
                    stuffCountConsumer.addAndGet(1);
                    count++;
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Поток потребитель %s закончил работу. Потребил: %d\n", getName(), count);
    }
}
