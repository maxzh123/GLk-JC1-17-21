package MultyTreadHomeWork;

public class Task52 {
       public Task52(int countThread) {
        for (int i = 1; i <= countThread; i++) {
            Thread52 t1 = new Thread52();
            t1.setName("My thread " + i);
            System.out.printf("Создан поток My tread %d\n",i);
            t1.start();
        }
    }
}