package Task39_42;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task40 {
    public static void main(String[] args) {

        Set<Integer> listOfNumbers = new HashSet<Integer>();
        listOfNumbers.add(12);
        listOfNumbers.add(12);
        listOfNumbers.add(14);
        listOfNumbers.add(8);
        listOfNumbers.add(124);
        listOfNumbers.add(12);
        test1(listOfNumbers);

    }
    private static void test1 (Set<Integer> list){
        for (Integer a: list) {
            System.out.println(a);
        }
    }
}
