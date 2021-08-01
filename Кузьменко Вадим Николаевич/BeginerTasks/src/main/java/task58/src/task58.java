import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.*;

public class task58 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Callable<String> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                File file = new File("da");
                try {
                    PrintWriter pw = new PrintWriter(file);
                    pw.println("тестим");
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                File file1 = new File("net");
                try {
                    PrintWriter pw1 = new PrintWriter(file1);
                    pw1.println("тестимfwewef");
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                File file2 = new File("mb");
                try {
                    PrintWriter pw2 = new PrintWriter(file);
                    pw2.println("тестим41141");
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                File file3 = new File("hz");
                try {
                    PrintWriter pw3 = new PrintWriter(file);
                    pw3.println("тестим141414");
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                File file4 = new File("vzm");
                try {
                    PrintWriter pw4 = new PrintWriter(file);
                    pw4.println("тестим4124");
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Finish - " + Thread.currentThread().getName() + file4.getName() + Thread.currentThread().getName() +  file2.getName() + Thread.currentThread().getName()  + file3.getName() + file.getName());
                countDownLatch.countDown();
            }
        });
    }

    private static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return null;
        }
    }
}







