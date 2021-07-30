package tasks55_57.task56;


import static tasks55_57.task56.Runner.test2;
import static tasks55_57.task56.Runner.test3;

public class TestThread1 extends Thread {
    public void run() {
        synchronized (tasks55_57.task56.Runner.test1) {
            System.out.println("Поток 1: Блокировка test1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                System.out.println("Поток 1: Ожидание теста 2 и 3");
            synchronized (test2) {
                System.out.println("Поток 1: блокировка теста 1 и 2");
            }
            synchronized (test3) {
                System.out.println("Поток 1: блокировка теста 1 и 3");
            }
        }
    }
}
