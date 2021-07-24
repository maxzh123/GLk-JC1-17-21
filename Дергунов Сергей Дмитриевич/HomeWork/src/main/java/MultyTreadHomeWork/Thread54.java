package MultyTreadHomeWork;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class Thread54 extends java.lang.Thread {
    @Override
    public void run(){
        ArrayList<Integer> arrayList;
        arrayList = RunMe.CreateCollectionOfRnd(10);
        System.out.println("Массив для потока " + getName() + " создан.");
        try {
            Task54.WriteToMyFile(arrayList, getName());
            System.out.println("Массив для потока "+getName() + " записан.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + getName() + " закончил работу.");
    }

}