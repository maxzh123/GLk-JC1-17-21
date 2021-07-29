package WorkBookTask.Task_52_54_Thread.Task57;

public class ThreadConsumer implements Runnable{


    @Override
    public void run() {
        while (Runner.count>0) {
            if (Runner.queue >0  ) { // если элементы есть в очереди то забрать
                System.out.println(Thread.currentThread().getName()+" я забрал элемент, осталось в очереди" + Runner.queue-- );
                Runner.count--;  // считаем количество операций
            }
            else {
                try {
                    Thread.sleep(500); //спать потом просыпаться проверять нет ли того чего можно забрать
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
