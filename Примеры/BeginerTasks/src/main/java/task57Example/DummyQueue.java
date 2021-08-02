package task57Example;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class DummyQueue {
    public  final AtomicBoolean TRIGGER=new AtomicBoolean(true);
    private final Queue<Integer> q=new LinkedBlockingQueue<Integer>();
    public final int UP=100;
    public final int DOWN=80;

    public void initWithVals(int count){
        for (int i=1;i<=count;i++){
            q.add(-i);//Для наглядности. делаем их отрицательными
        }
        if (TRIGGER.get()){
            TRIGGER.set(q.size()<UP);
        }else{
            TRIGGER.set(q.size()<DOWN);
        }
    }

    public  final void put(Integer i){
        if (TRIGGER.get()){
            synchronized (this){
                q.add(i);
                if (q.size()>=UP && TRIGGER.get()){
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
            if (q.size()<=DOWN && !TRIGGER.get()){
                synchronized (TRIGGER){
                    if (q.size()<=DOWN && !TRIGGER.get()){
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
