package WorkBookTask.Task_58_60;



import java.io.File;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class NewThread implements Runnable {
    private final File file = new File(Creater.PATH);
    private final AtomicInteger nameTh =new AtomicInteger(0);
    private final AtomicInteger fileIncrement =new AtomicInteger(0);
    private final AtomicInteger fileIncrementRes =new AtomicInteger(0);

    private final   String nameFile = "test" ;
    private  String nameThreads = " поток №"; // при заходе в класс потоков получат имена потоки
    private int myFile;
    @Override
    public void run() {
        while (myFile<10) { //пока не достигнет создания 10 файлов

            myFile++;
            Creater.createFile(file,"test" +myFile+".txt");
            System.out.println(Thread.currentThread().getName()+ " отработал! "+"Cоздал файл "+ nameFile+fileIncrement.incrementAndGet()+".txt ");
         }

        }

    }

