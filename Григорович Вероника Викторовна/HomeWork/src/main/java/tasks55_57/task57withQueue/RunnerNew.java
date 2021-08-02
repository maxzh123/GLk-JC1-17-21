package tasks55_57.task57withQueue;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnerNew {

static AtomicInteger countAll=new AtomicInteger();
    public static void main(String[] args) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<Integer>();
        for (int i=0; i<200; i++) {
            integerArrayDeque.add(i);
        }
      //  Queue <Integer> integerQueue=new ArrayBlockingQueue<>(200);
        createProducer(3, integerArrayDeque);
        createConsumer(2, integerArrayDeque);
    }

    public static void createProducer(int count,  ArrayDeque<Integer> integerArrayDeque) {
        ProducerNew producer=new ProducerNew(integerArrayDeque);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(producer);
            t.setName("я поток Производитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }

    public static void createConsumer(int count,  ArrayDeque<Integer> integerArrayDeque) {
        ConsumerNew consumer=new ConsumerNew(integerArrayDeque);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(consumer);
            t.setName("я поток Потребитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }
    }

