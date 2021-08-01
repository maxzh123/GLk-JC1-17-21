package WorkBookTask.Task_58_60;


import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    private static final int COUNT_TREADS=3;

    public static void main(String[] args) {

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(COUNT_TREADS);
        for (int i = 0; i < COUNT_TREADS; i++) {
            executor.execute(new NewThread1());
        }
        executor.shutdown();
//        Creater cr =new Creater();
//        cr.print();
    }

//        public static void runnerGO(){
//            File file = new File(Creater.PATH);
//            Creater creater = new Creater();
//            creater.createFile(file);
//            for (int i = 0; i < Creater.array.length; i++) {  // запись данных в файлы,будут записаны строки рандомом.
//                Writer.writeInFile(Creater.array[i]); // во все 10 файлов
//            }
//        }
    }
