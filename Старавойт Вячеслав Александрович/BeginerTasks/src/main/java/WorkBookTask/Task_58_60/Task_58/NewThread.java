package WorkBookTask.Task_58_60.Task_58;



import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class NewThread implements Runnable {
    private final File file = new File(Creater.PATH);
    private final AtomicInteger nameTh =new AtomicInteger(0);
    private final AtomicInteger fileIncrement =new AtomicInteger(0);
    private final AtomicInteger fileIncrementRes =new AtomicInteger(0);

    private final   String nameFile = "test"+nameTh.incrementAndGet()+".txt" ;
    private  String nameThreads = " поток №"; // при заходе в класс потоков получат имена потоки
    private int myFile=0;
    @Override
    public void run() {
                                 //пока не достигнет создания 10 файло
            myFile++;
            Creater.createFile(file,nameFile);
            System.out.println(Thread.currentThread().getName()+ " отработал! "+"Cоздал файл "+ nameFile+ "Всего"+myFile);
         }

        }


