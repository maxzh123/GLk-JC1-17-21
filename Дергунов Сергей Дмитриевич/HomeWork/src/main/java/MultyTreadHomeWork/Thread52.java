package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.concurrent.Callable;

class Thread52 implements Callable {
    @Override
    public Long call() {
        System.out.println("Запущен поток :" + Thread.currentThread().getName());
        ArrayList<Integer> arrayList;
        arrayList = RunMe.CreateCollectionOfRnd(10);
        try {
            Thread.sleep(Math.round(Math.random() * 2000));//Паузу создал чтобы разнести потоки по времени.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " закончил работу.");
        return RunMe.CalculateAverage(arrayList);
    }
}

