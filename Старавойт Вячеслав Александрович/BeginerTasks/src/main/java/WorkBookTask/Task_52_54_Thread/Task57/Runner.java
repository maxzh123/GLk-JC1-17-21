package WorkBookTask.Task_52_54_Thread.Task57;
// Задание есть 3 производителя, 2 потребителя, все разные потоки и работают все одновременно. Есть очередь
// с 200 элементами. ПРоизводители добавляют, потребители отнимают, производители спят когда элементов >100
// и если нет очереди спят потребители, просынаются производ. когда элементов <=80, Все это работает пока
// обработанных элементов не станет 1000.
public class Runner {
    static volatile int  queue = 200; //наша очередь
 static volatile int count =1000;  // наше кол-во операций которое нужно обрабатывать.

    public static void main(String[] args) {
        createThreadProducer(3); // 3 потока производителя
        createThreadConsumer(2); // 2 потока-потребителя

    }

    private static void createThreadProducer(int count) {
       ThreadProducer threadProducer =new ThreadProducer();
        for (int i=1; i<=count;i++){
            Thread tp = new Thread(threadProducer);
            tp.setName("Я поток производитель № " + i);
            tp.setDaemon(false);
            tp.start();
        }
    }
    private static void createThreadConsumer(int count) {
        ThreadConsumer threadConsumer =new ThreadConsumer();
        for (int i=1; i<=count;i++){
            Thread tc = new Thread(threadConsumer);
            tc.setName("Я поток потребитель № " + i);
            tc.setDaemon(false);
            tc.start();
        }
    }
    static  void  ManagerThread(String s) {

            if (s.equals("take") && queue > 0) { // если элементы есть в очереди то забрать
                System.out.println(Thread.currentThread().getName() + " я забрал элемент, осталось в очереди" + queue--);
                count--;}
            else if(s.equals("add")&& queue<=80){
                System.out.println(Thread.currentThread().getName()+" я положил элемент, всего  в очереди" + queue++ );
               count--;
            } else {
                try {
                    Thread.sleep(5); //спать потом просыпаться проверять нет ли того чего можно забрать или отдать.
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
            }
        }
    }
