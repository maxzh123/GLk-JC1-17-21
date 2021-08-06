package Task52_53;

import java.util.ArrayList;
import java.util.List;

public class Task53 {
    public static void main(String[] args) {
        List <Integer> arrayOfRandomNumbers = new ArrayList<Integer>();
        int count = 0;
        while (count<10){
            arrayOfRandomNumbers.add(count);
            System.out.println("в ячейке"+arrayOfRandomNumbers.get(count));
            count++;
        }
        int max = arrayOfRandomNumbers.get(0);
        for (int i=1; i<arrayOfRandomNumbers.size();i++)
         {
             if (max<arrayOfRandomNumbers.get(i))
                max = arrayOfRandomNumbers.get(i);
            }
        System.out.println("max =" + max);
        }
        //завтра все доделать, создать класс поток и запустить 10 потоков

    }

