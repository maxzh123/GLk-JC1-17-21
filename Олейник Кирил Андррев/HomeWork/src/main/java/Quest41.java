package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quest41 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 10));
        }
        int max =array.get(0);
        Iterator<Integer> numbersIterator = array.iterator();
        while (numbersIterator.hasNext()){
            Integer mark=numbersIterator.next();
            if (max<mark){max=mark;}
        }
        System.out.println("максимальная оценка " + max);
        for (Integer print : array) {
            System.out.println(print);
        }
    }
}

