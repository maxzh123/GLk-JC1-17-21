package tasks55_57.task57withQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RunnerNew {

static AtomicInteger countAll=new AtomicInteger();
    public static void main(String[] args) {
        Queue <Integer> integerQueue=new ArrayBlockingQueue<>(200);
        createProducer(3, integerQueue);
        createConsumer(2, integerQueue);
    }

    public static void createProducer(int count, Queue <Integer> integerQueue) {
        ProducerNew producer=new ProducerNew(integerQueue);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(producer);
            t.setName("я поток Производитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }

    public static void createConsumer(int count, Queue <Integer> integerQueue) {
        ConsumerNew consumer=new ConsumerNew(integerQueue);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(consumer);
            t.setName("я поток Потребитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }
    }

