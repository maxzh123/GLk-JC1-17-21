package Tasks52_54;

import static Tasks52_54.Task52.createList;
import static Tasks52_54.Task52.integerList;

public class TestThread extends Thread{
    public void run() {
        integerList=createList();
        integerList.forEach(System.out::print);

        int sum=integerList.stream()
                .mapToInt(x ->x)
                .sum();

        System.out.println("Среднее арифметическое: "+(sum/integerList.size())+". Работает поток "+Thread.currentThread().getName());
        System.out.println("________________________");

    }

}
