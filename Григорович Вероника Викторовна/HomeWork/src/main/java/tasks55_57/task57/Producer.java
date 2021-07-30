package tasks55_57.task57;

public class Producer implements Runnable {
    static int addRandomNumber;
    Queue1 queue1;

    public Producer(Queue1 queue1) {
        this.queue1 = queue1;
    }

    @Override
    public void run() {
            addRandomNumber = (int) (Math.random() * 100 + 1);
            for (int i = 0; i < addRandomNumber; i++) {
                queue1.put();
            }
        }
    }


