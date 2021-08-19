package Task61_63;

import java.util.ArrayList;

public class Task63 {
    public static void main(String[] args) {
        ArrayList <Integer> people = new ArrayList<Integer>();
        for (int i = 1; i<100; i++) {
            people.add((int) (Math.random()*10)+3);
        }
        people.stream().sorted().forEach(System.out::print);
        System.out.println();
        boolean m = people.stream()
                .anyMatch(number -> number%3==0 || number%5==0);
        System.out.println(m);
    }
}
