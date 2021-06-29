package PreviousTasks;

import java.util.ArrayList;

public class task15 { //по заданию надо через break, но то ли лыжи не едут, но я так не поняла как через break решить
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        boolean isprime;
        for (int i = 50; i < 70; i++) {
            isprime = true;
            for (int j = 2; j <= (int)(Math.sqrt(i)); j++) {
                if ((i % j) == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                list.add(i);
            }
        }
        System.out.println("Второе простое число - это "+list.get(1));
    }
}