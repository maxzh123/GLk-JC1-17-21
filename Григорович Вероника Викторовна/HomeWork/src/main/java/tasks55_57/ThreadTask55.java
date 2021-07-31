package tasks55_57;

public class ThreadTask55 implements Runnable{
    @Override
    public void run() {
        try {
            threadsNames();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
        public synchronized void threadsNames() throws InterruptedException {

            System.out.println("Имя потока: "+Thread.currentThread().getName());
            Thread.sleep(2000);

        }
    }

