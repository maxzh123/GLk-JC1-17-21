package task41;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer>score = new ArrayList<Integer>();
        score.add(10);
        score.add(4);
        score.add(5);
        score.add(3);
        score.add(5);
        score.add(1);
        score.add(313);
        score.add(5);
        score.add(11);
        score.add(7);

        int max =score.get(0);

        Iterator<Integer> numbersIterator = score.iterator();
        while (numbersIterator.hasNext()){
            Integer i=numbersIterator.next();
            if (max<i){max=i;}
        }
        System.out.println(max);
        }
    }







