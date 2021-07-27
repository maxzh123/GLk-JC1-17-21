package Tasks52_54;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task52 {
    static List <Integer> integerList=new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException {
        integerList=createList();
        integerList.forEach(System.out::println);
        createThreads();
    }

    public static List<Integer> createList() {
        List <Integer> list=new Random()
                .ints(1,100)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
                return list;

    }

    public static void createThreads() throws InterruptedException{
        TestThread [] threads=new TestThread[10];
        for (int i = 0; i < 10; i++) {
            threads[i]=new TestThread();
            threads[i].start();
            Thread.sleep(1000);
        }
    }


    }

