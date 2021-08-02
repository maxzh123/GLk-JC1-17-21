package MultyTreadHomeWork;

import java.util.ArrayList;

public class CompletableFuture52 {
    public static Long CompletableFuture() {
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

