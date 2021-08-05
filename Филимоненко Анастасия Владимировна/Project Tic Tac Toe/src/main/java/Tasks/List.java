package Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<Integer>();
        grade.add(3);
        grade.add(7);
        grade.add(9);
        grade.add(2);
        grade.add(1);
        grade.add(8);
        grade.add(10);
        grade.add(4);
        grade.add(5);
        grade.add(6);

        int max =grade.get(0);

        Iterator<Integer> numbersIterator = grade.iterator();
        while (numbersIterator.hasNext()){
            Integer i=numbersIterator.next();
            if (max<i){max=i;}
        }
        System.out.println(max);
    }
}
