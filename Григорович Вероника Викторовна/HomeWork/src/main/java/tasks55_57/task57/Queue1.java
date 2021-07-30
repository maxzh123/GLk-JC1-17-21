package tasks55_57.task57;

public class Queue1 {
    public int count=200;
    public synchronized void get() {
        while (count<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName()+" Потребитель взял товар, товаров осталось: "+count);
        notify();
    }
    public synchronized void put() {
        while (count>=100) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        if (count<=80) {
        count++;
        System.out.println(Thread.currentThread().getName()+" Производитель добавил товар, итого товара: "+count);
       notify();
    }
}
}
