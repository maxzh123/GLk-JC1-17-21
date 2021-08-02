import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.*;

// public class task58 {
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

 class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            String key = "file" + item;
            File file = File.createTempFile(key, ".txt", new File("d:\\"));

            Writer writer = new OutputStreamWriter(new FileOutputStream(file));
            writer.write("123456789");
            writer.close();
            System.out.println(Thread.currentThread().getName());

        }
        return call();
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<>();
        Callable<String>callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            Future <String> future = executor.submit(callable);
            list.add(future);
        }
        List <String> resultList = new ArrayList<>();
        for (Future <String> future : list) {
            try {
                resultList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executor.shutdown();
            System.out.println(resultList);
        }
    }

    }









   // public static void main(String[] args) throws FileNotFoundException {
     //   String str = "Gello";
        // FileInputStream fos = new FileInputStream("c:\\Users\\37529\\GLk-JC1-17-21\\Кузьменко Вадим Николаевич\\BeginerTasks\\src\\main\\java\\task58\\da");
        // byte[] buffer = str.getBytes();
      //  fos.
    //}
//}



     //   List<Future<String>> futures = new ArrayList<Future<String>>();
       // for (int i = 0; i < 10; i++) {
    //        File file = new File("AAAAAAAAAAAA");
     //       try {
     //           PrintWriter pw = new PrintWriter(file);
     //           pw.println("тестим");
     //       } catch (FileNotFoundException fileNotFoundException) {
     //           fileNotFoundException.printStackTrace();

         //   }
       //  }


       // ExecutorService executorService = Executors.newFixedThreadPool(2);
      //  CountDownLatch countDownLatch = new CountDownLatch(4);

       // executorService.execute(new Runnable() {
       //     @Override
        //    public void run() {
          //      File file = new File("da");
            //    try {
              //      PrintWriter pw = new PrintWriter(file);
                //    pw.println("тестим");
               // } catch (FileNotFoundException fileNotFoundException) {
                 //   fileNotFoundException.printStackTrace();
                //}
                //try {
                  //  Thread.sleep(1000);
                //} catch (InterruptedException e) {
                  //  e.printStackTrace();
                // }

                //System.out.println("Finish - " + Thread.currentThread().getName() + file4.getName() + Thread.currentThread().getName() +  file2.getName() + Thread.currentThread().getName()  + file3.getName() + file.getName());
                //countDownLatch.countDown();
          //  }
        //});
    //}

    //private static class MyCallable implements Callable<String> {
      //  @Override
        //public String call() throws Exception {
          //  return null;
        //}
    //}
//}





