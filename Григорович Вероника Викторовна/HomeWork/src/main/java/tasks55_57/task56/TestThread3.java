package tasks55_57.task56;

public class TestThread3 extends Thread{
    public void run() {
        synchronized (tasks55_57.task56.Runner.test3) {
            System.out.println("Поток 3: Блокировка test3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток 3: Ожидание теста 1 и 2");
            synchronized (tasks55_57.task56.Runner.test1) {
                System.out.println("Поток 3: блокировка теста 1 и 3");
            }
            synchronized (tasks55_57.task56.Runner.test2) {
                System.out.println("Поток 3: блокировка теста 2 и 3");
            }
        }
    }
}
