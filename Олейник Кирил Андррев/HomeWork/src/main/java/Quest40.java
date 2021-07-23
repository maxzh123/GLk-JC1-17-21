package main.java;

import java.util.ArrayList;
import java.util.List;

public class Quest40 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i) == array.get(j)) {
                    array.remove(j);
                    j--;
                }
            }
        }
        for (Integer print : array) {
            System.out.println(print);
        }
    }
}
