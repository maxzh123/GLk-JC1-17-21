package WorkBookTask.Task_52_54_Thread.Task52;

import java.util.ArrayList;

public class Task_52 {

static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException {

          createThread(10);
    }


    static void createThread(int count) throws InterruptedException {
            NewThread[] newThreads = new NewThread[count];
            for(int i =0; i < count; i++){
                newThreads[i]=new NewThread();
                newThreads[i].start();
                Thread.sleep(500);
        }
    }
    static ArrayList<Integer> createArrayList(){
        arrayList =null;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i =0; i<10;i++){
            arrayList.add(i*((int)(Math.random()+5+i)));
        }
        return arrayList;
    }

}
