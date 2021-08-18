package Tasks61_63;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sample {
    public static void main(String[] args) {
//        Stream.of("10", "11")
//                        .map(x -> Integer.parseInt(x, 16))
//                        .forEach(System.out::println);
        long count1 = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .peek(System.out::println)
                .count();
        System.out.println(count1);
//        String count= Stream
//                .generate(()->new Random().nextInt(255))
//                .limit(10)
//                .filter(x -> x!=0)
//               .map(intValue -> (String.valueOf(intValue.intValue())))
//
//               .peek((x) ->System.out.print(x+" "))
//                .reduce("",(st,i)->st+=i);
//               // .count();
//        System.out.println(count);
    }
}
