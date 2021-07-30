package tasks55_57.task57;

public class Consumer implements Runnable {
    Queue1 queue1;

    public Consumer(Queue1 queue1) {
        this.queue1 = queue1;
    }

    @Override
    public void run() {

            for (int i = 0; i < Producer.addRandomNumber; i++) {
                queue1.get();
            }
        }
    }



