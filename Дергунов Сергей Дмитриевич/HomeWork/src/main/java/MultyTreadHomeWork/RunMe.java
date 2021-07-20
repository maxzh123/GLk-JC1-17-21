package MultyTreadHomeWork;

import java.util.ArrayList;
import java.util.stream.Stream;

public class RunMe {

    public static void main(String[] args) {
          Task52 Task52 =  new Task52(10);
    }

    public static ArrayList<Integer> CreateCollectionOfRnd(int count) {
        ArrayList <Integer> rndArrayList = new <Integer> ArrayList();
        for (int i = 0; i < count; i++) {
            rndArrayList.add((int) Math.round(Math.random() * 1000));
        }
        return rndArrayList;
    }

    public static long CalculateAverage(ArrayList<Integer> arrayList) {
        Stream<Integer> streamInt;
        streamInt = arrayList.stream();
        int sum = streamInt.mapToInt(x -> x).sum();
        streamInt = arrayList.stream();
        return sum / (streamInt.count());
    }

    public static void PrintArrayList(ArrayList<Integer> arrayList) {
        Stream<Integer> streamInt = arrayList.stream();
        streamInt.forEach(System.out::println);
    }
}
