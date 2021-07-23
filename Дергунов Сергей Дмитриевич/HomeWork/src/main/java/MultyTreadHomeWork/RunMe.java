package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunMe {

    public static void main(String[] args) {
        System.out.println("----------------TASK 52-------------------");
        Task52 Task52 =  new Task52(10);//

        System.out.println("------TASK 52 with CompletableFuture------");
        try {
            Task52CompletableFuture Task52CF = new Task52CompletableFuture(10);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------TASK 54-------------------");
        Task54 Task54 = new Task54(5);
    }

    public static ArrayList<Integer> CreateCollectionOfRnd(int count) {
        ArrayList <Integer> rndArrayList = (ArrayList<Integer>) new Random()
                .ints(0,1000)
                .limit(count)
                .boxed()
                .collect(Collectors.toList());
        return rndArrayList;
    }

    public static long CalculateAverage(ArrayList<Integer> arrayList) {
        Stream<Integer> streamInt;
        streamInt = arrayList.stream();
        int sum = streamInt.parallel().mapToInt(x -> x).sum();
        streamInt = arrayList.stream();
        return sum / (streamInt.count());
    }

    public static void PrintArrayList(ArrayList<Integer> arrayList) {
        Stream<Integer> streamInt = arrayList.stream();
        streamInt.forEach(System.out::println);
    }
}
