package task57Example;

import java.util.concurrent.atomic.AtomicInteger;

import static task57Example.Runner.LIMIT;

public class Producer2 implements Runnable{
    private static final AtomicInteger seq=new AtomicInteger(0);
    private static final AtomicInteger producers=new AtomicInteger(0);
    private static final AtomicInteger produced=new AtomicInteger(0);
    private int myProduced=0;
    private final String name="Производитель №"+producers.incrementAndGet();
    private final DummyQueue q;

    public Producer2(DummyQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        //Пока не создали тыщу - работаем.
        while (produced.get()<LIMIT){
            Integer i=seq.incrementAndGet();
            while(!q.TRIGGER.get()){
                waitForTrigger();
            }

            int num=produced.incrementAndGet();
            if (num<=LIMIT){
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
