package main.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Quest39 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        Iterator<Integer> numbersIterator = arrayList.iterator();
        while (numbersIterator.hasNext()) {
            Integer next=numbersIterator.next();
            if (next<4){
                numbersIterator.remove();
            }
        }

        System.out.println("Удовлетворительные оценки:");
        for (Integer print : arrayList) {
            System.out.println(print);
        }
    }
}
