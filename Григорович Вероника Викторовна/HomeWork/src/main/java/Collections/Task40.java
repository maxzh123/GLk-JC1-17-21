package Collections;

import java.util.ArrayList;

public class Task40 {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<Integer>();
        addNumbersInList(list);
        deleteTheSameNumbers(list);

    }

    public static void addNumbersInList(ArrayList <Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*3));
        }
        System.out.println(list);
    }
    public static void deleteTheSameNumbers(ArrayList <Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
        }
    }

