package WorkBookTask.Task_58_60;

import java.io.File;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class NewThread1 implements Runnable {
    private final File file = new File(Creater.PATH);
    private final AtomicInteger nameTh =new AtomicInteger(0);
    private final AtomicInteger fileIncrement =new AtomicInteger(0);
    private final AtomicInteger fileIncrementRes =new AtomicInteger(0);
    private int myProduced =0;
   // private final String str = fileIncrement.incrementAndGet()+"";
    private  String nameFile = "test" +fileIncrement.incrementAndGet()+".txt";
    private  String nameThreads = " поток №" + nameTh.incrementAndGet() ; // при заходе в класс потоков получат имена потоки
    @Override
    public void run() {
        while (fileIncrement.get()<=10) { //пока не достигнет создания 10 файлов
            Creater.createFile(file,nameFile); // разбиваем создание файлов на 3 потока
            int sum = fileIncrementRes.incrementAndGet();
            myProduced++;
            System.out.println(String.format("Я \"%s\" создал файл \"%s\"  это мой %d продукт, всего произведено %d",nameThreads,nameFile,myProduced,sum));
        }

        }

    }

