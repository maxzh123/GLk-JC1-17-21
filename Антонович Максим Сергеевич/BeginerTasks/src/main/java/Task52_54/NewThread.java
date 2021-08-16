package Task52_54;

import java.util.*;
//FIXME Это очень очень странная конструкция.
public class NewThread implements Runnable{
    Thread x;
    public NewThread (){
        x = new Thread(this);
    }
    @Override
    public void run() {
        int count = 0;
        int average = 0;
        int summ = 0;
        List<Integer> collection = new ArrayList<Integer>();
        while (count < 10) {
            collection.add(count*((int) (Math.random() * 5) +2));
            summ+=collection.get(count);
            count++;
        }
        average = summ/collection.size();
        System.out.println("average: "+ average);
    }
    void start (){
        x.start();
    }
}
