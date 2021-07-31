package Tasks52_54.task53;

public class RunnerTask53 {
    static Thread [] threads=new Thread[10];

    public static void main(String[] args) throws InterruptedException {
        TestTh testTh=new TestTh();
        for (int i = 0; i < 10; i++) {
            Thread t=new Thread(testTh);
            t.setName("я поток номер "+i);
            t.setDaemon(false);
            t.start();
            Thread.sleep(1000);
        }

    }


}
