package Tasks61_63;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class sample {
    public static void main(String[] args) {
        String count= Stream
                .generate(()->new Random().nextInt(255))
                .limit(10)
                .filter(x -> x!=0)
               .map(intValue -> (String.valueOf(intValue.intValue())))

               .peek((x) ->System.out.print(x+" "))
                .reduce("",(st,i)->st+=i);
               // .count();
        System.out.println(count);
    }
}
