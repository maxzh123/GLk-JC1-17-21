package WorkBookTask.Task_52_54_Thread.Task57;

public class ThreadProducer implements Runnable{

    @Override
    public void run() {
        while (Runner.count>0) {
            if (Runner.queue >= 100 ) { //проверка сколько элементов в очереди
                try {
                    Thread.sleep(5); //спим
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(Runner.queue<=80){ // проснулись начали производить товары.
                System.out.println(Thread.currentThread().getName()+" я положил элемент, всего  в очереди" + Runner.queue++ );
                Runner.count--; // уменьшаем наши операции.
            }
        }

    }
}
