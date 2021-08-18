package WorkBookTask.Task_58_60.Task_58;


import java.util.concurrent.*;

//Fixme лентяй! Вам вполне по силам было и конструктор с именами файлов замутить.
public class Runner {
    private static final int COUNT_TREADS = 3;

    //  private static   List<Future<String>> list = new ArrayList<Future<String>>();

    public static void main(String[] args) {

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(COUNT_TREADS);
        for (int i = 0; i < 10; i++) { //10 задач будем делать.
            executor.execute(new NewThread());
        }
        executor.shutdown();
    }
}


//        Callable<String> callable = new MyCallable();
//        for(int i=0; i< 10; i++){ //10 задач одновременно
//            Future<String> future = executor.submit(callable);
//            list.add(future);
//        }
//        for(Future<String> fut : list){
//            try {
//                // печатаем в консоль возвращенное значение Future
//                // будет задержка в 1 секунду, потому что Future.get()
//                // ждет пока таск закончит выполнение
//                System.out.println("Тут поток был"+new Date()+ "::" + fut.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//        executor.shutdown();
////        Creater cr =new Creater();
////        cr.print();
//    }

//        public static void runnerGO(){
//            File file = new File(Creater.PATH);
//            Creater creater = new Creater();
//            creater.createFile(file);
//            for (int i = 0; i < Creater.array.length; i++) {  // запись данных в файлы,будут записаны строки рандомом.
//                Writer.writeInFile(Creater.array[i]); // во все 10 файлов
//            }
//        }

