package Task52_53;

import java.util.ArrayList;
import java.util.List;

public class NewThreadForTask53 implements Runnable {
    Thread x;
    public NewThreadForTask53 (){
        x = new Thread(this);
    }
    @Override
    public void run() {
        List<Integer> arrayOfRandomNumbers = new ArrayList<Integer>();
        int count = 0;
        while (count<10){
            arrayOfRandomNumbers.add(count*((int) (Math.random() * 5) +2));
            count++;
        }
        int max = arrayOfRandomNumbers.get(0);
        for (int i=1; i<arrayOfRandomNumbers.size();i++)
        {
            if (max<arrayOfRandomNumbers.get(i))
                max = arrayOfRandomNumbers.get(i);
        }
        System.out.println("max =" + max + ";"+ "имя потока" + Thread.currentThread().getName());
    }
    void start (){
        x.start();
    }
}
