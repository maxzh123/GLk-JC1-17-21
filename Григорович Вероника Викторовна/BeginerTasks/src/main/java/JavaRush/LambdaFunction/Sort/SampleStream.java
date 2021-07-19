package JavaRush.LambdaFunction.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SampleStream {
    public static void main(String[] args) {
        ArrayList <String> strings=new ArrayList<String>();
        Collections.addAll(strings, "Winter", "Spring", "Summer", "Autumn");
    //    strings.forEach(System.out::println);
        Stream <String> stringStream=getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);
        Integer [] integers=new Integer[]{1,3,4,55,1,5};
        Stream <Integer> integerStream=getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }
    public static Stream <String> getStreamFromArrayList(ArrayList <String> list) {
        return list.stream();
    }

    public static Stream <Integer> getStreamFromArray(Integer [] integers) {
        return Arrays.stream(integers);
    }
}
