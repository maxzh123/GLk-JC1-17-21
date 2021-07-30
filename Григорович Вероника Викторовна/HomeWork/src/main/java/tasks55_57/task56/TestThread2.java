package tasks55_57.task56;

import static tasks55_57.task56.Runner.*;

public class TestThread2 extends Thread{
    public void run() {
        synchronized (tasks55_57.task56.Runner.test2) {
            System.out.println("Поток 2: Блокировка test2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 2: Ожидание теста 1 и 3");
            synchronized (test1) {
                System.out.println("Поток 1: блокировка теста 1 и 2");
            }
            synchronized (test3) {
                System.out.println("Поток 1: блокировка теста 2 и 3");
            }
        }
    }
}
