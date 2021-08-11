package Task55_57;

public class ThreadForTask55 implements Runnable{

    @Override
    public void run() {
        try {
            print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void  print () throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        wait(2000);
    }
}

