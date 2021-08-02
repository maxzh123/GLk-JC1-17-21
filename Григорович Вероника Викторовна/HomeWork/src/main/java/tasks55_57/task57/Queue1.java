package tasks55_57.task57;

public class Queue1 {
    public static volatile int count = 200;

    public synchronized void get() {
            while (count < 1) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count--;
            Runner.countAll++;
            System.out.println(Thread.currentThread().getName() + " Потребитель взял товар, товаров осталось: " + count + " " + Runner.countAll);
            this.notify();
        }


    public synchronized void put() {

            while (count >= 100) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (count <= 80) {
                count++;
                Runner.countAll++;
                System.out.println(Thread.currentThread().getName() + " Производитель добавил товар, итого товара: " + count + " " + Runner.countAll);
                this.notify();
            }
        }
    }

