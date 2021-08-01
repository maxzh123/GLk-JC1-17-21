package tasks55_57.task57;


public class Runner {

public static volatile int countAll=0;
    public static void main(String[] args) {
        Queue1 queue1=new Queue1();
        createProducer(3, queue1);
        createConsumer(2, queue1);
    }

    public static void createProducer(int count, Queue1 queue1)  {
        Producer producer=new Producer(queue1);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(producer);
            t.setName("я поток Производитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }

    public static void createConsumer(int count, Queue1 queue1)  {
        Consumer consumer=new Consumer(queue1);
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(consumer);
            t.setName("я поток Потребитель "+i);
            t.setDaemon(false);
            t.start();
        }
    }
}

