package tasks58_60;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CallableTask59 implements Callable <String> {

    @Override
    public String call() throws Exception {
        List<Integer> integerList=generateCollections();
       TimeUnit.SECONDS.sleep((int)(Math.random()*10+1));
        String sum=String.valueOf(getSumAllListElements(integerList));
        System.out.println("Сумма элементов коллекции, представленная в виде строки: "+sum);
        return Thread.currentThread().getName();
    }

    public static List <Integer> generateCollections() {
        List<Integer> list=new Random()
                .ints(1,300)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        return list;
    }

    public static int getSumAllListElements( List<Integer> integerList) {
        int sum=integerList.stream()
                .mapToInt((x) -> x)
                .sum();
        return sum;
    }
}
