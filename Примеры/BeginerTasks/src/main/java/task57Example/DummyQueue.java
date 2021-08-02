package task57Example;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class DummyQueue {
    public  final AtomicBoolean TRIGGER=new AtomicBoolean(true);
    private final Queue<Integer> q=new LinkedBlockingQueue<Integer>();

    public  final void put(Integer i){
        if (TRIGGER.get()){
            synchronized (this){
                q.add(i);
                if (q.size()>=100 && TRIGGER.get()){
                    synchronized (TRIGGER){
                        if (TRIGGER.get()){
                            TRIGGER.set(false);
                            System.out.println("Горшочек НЕ ВАРИ!!!");
                        }
                    }
                }
               this.notify();
            }
        }
    }

    public Integer pool(){
        Integer res=null;
        synchronized (this){
            if (q.size()<=80 && !TRIGGER.get()){
                synchronized (TRIGGER){
                    if (q.size()<=80 && !TRIGGER.get()){
                        System.out.println("Горшочек ВАРИ!!!");
                        TRIGGER.set(true);
                        TRIGGER.notifyAll();
                    }
                }
            }
            res=q.poll();
        }
        return res;
    }

    public  int size(){
        return q.size();
    }
}
