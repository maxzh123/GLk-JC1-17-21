package task57Example;

import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static task57Example.Runner.INIT;
import static task57Example.Runner.LIMIT;

public class Consumer implements Runnable{
    private static final AtomicInteger consumers=new AtomicInteger(0);
    private static final AtomicInteger consumed=new AtomicInteger(0);

    private int myConsumed=0;
    private final String name="Потребитель №"+consumers.incrementAndGet();
    private final DummyQueue q;

    public Consumer(DummyQueue q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (consumed.get()<(LIMIT+INIT) || q.size()>0){
            while(q.size()==0){
                if (consumed.get()>=(LIMIT+INIT) && q.size()==0) return;
                waitForData();
            }
            Integer i=q.pool();
            if (i!=null) {
                int num = consumed.incrementAndGet();
                myConsumed++;
                System.out.println(String.format("Я \"%s\" захавал из очереди %d это моя %d хавка, всего схаванно %d", name, i, myConsumed, num));
            }else{
                System.out.println(String.format("Я \"%s\" и я лосонул тунца.", name));
            }
        }
        System.out.println(String.format("Я \"%s\". Работу завершил. Всего захавал %d из %d",name,myConsumed,consumed.get()));
    }

    void waitForData(){
        synchronized (q){
            if (q.size()==0){
                try {
                    q.wait();
                    //q.wait(500); // Это более безопасный вариант, который гарантирует что поток проснется сам в конце и завершит свою работу.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
