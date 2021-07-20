package MultyTreadHomeWork;

import java.util.ArrayList;

class Thread52 extends java.lang.Thread {
    @Override
    public void run(){
        ArrayList<Integer> arrayList;
        arrayList = RunMe.CreateCollectionOfRnd(10);
        try {
            Thread.sleep(Math.round(Math.random()*2000));//Паузу создал чтобы разнести потоки по времени.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Среднее значение для потока " + getName() + " is - " + RunMe.CalculateAverage(arrayList));
        try {
            Thread.sleep(Math.round(Math.random()*2000));//Паузу создал чтобы разнести потоки по времени.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + getName() + " закончил работу.");
    }
}

