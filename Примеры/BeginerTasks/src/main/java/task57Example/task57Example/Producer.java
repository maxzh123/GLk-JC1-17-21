package task57Example;

import java.util.concurrent.atomic.AtomicInteger;

import static task57Example.Runner.LIMIT;

public class Producer implements Runnable{
    private static final AtomicInteger producers=new AtomicInteger(0);
    private static final AtomicInteger produced=new AtomicInteger(0);
    private int myProduced=0;
    private final String name="Производитель №"+producers.incrementAndGet();
    private final DummyQueue q;

    public Producer(DummyQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        //Пока не создали тыщу - работаем.
        while (produced.get()<LIMIT){
            while(!q.TRIGGER.get()){
                waitForTrigger();
            }

            int num=produced.incrementAndGet();
            if (num<=LIMIT){
                Integer i=(int) (Math.random() * 100 + 1);
                q.put(i);
                myProduced++;
                System.out.println(String.format("Я \"%s\" пихнул в очередь %d это мой %d продукт, всего произведено %d",name,i,myProduced,num));
            }
        }
        System.out.println(String.format("Я \"%s\". Работу завершил. Всего произвел %d из %d",name,myProduced,produced.get()));
    }

    void waitForTrigger(){
        synchronized (q.TRIGGER){
            if (!q.TRIGGER.get()){
                try {
                    q.TRIGGER.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
