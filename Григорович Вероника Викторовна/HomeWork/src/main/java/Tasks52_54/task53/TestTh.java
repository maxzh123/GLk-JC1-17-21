package Tasks52_54.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestTh implements Runnable {
    Thread thread;
  static   List<Integer> integerList=new ArrayList<Integer>();


    @Override
    public void run() {
        List<Integer> integerList=new Random()
                .ints(1,50)
                .limit(10)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        Integer[] integers = integerList.stream() //преобразовали лист в массив
                .toArray(Integer[]::new);
        System.out.println("Максимальный элемент в массиве - это последний элемент со значением "+integers[integers.length-1]+
                ". Работает поток "+Thread.currentThread().getName());
    }
}
