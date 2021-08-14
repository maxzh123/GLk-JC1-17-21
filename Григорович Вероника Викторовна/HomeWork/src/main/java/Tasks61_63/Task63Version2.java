package Tasks61_63;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
//сгенерировать List коллекцию целых чисел и n элементов от мин до макс, определить есть ли в этой коллекции которые делятся и на 3 и на 5
//FIXME нет min|max куча лишних действий. то что надо не сделано.
public class Task63Version2 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20 + 1);
        List<Integer> list=new Random()
                .ints(0,100)
                .limit(n)
                .boxed()
                .sorted(Comparator.comparingInt(x -> x))
                .peek((x) ->System.out.print(x+" "))
                .filter((x) -> x % 3 == 0 && x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(list);
        List<Integer> integerNumbers= findNumbersWithDivisibleBy3And5(list); //тут будет коллекция в которой только числа которые делятся на 3 и на 5
        System.out.println("Числа, которые делятся на 3 и на 5: "+integerNumbers);
    }


    public static List<Integer> findNumbersWithDivisibleBy3And5(List<Integer> list) {
        List<Integer> integerNumbers=list.stream()
                .filter((x) -> x % 3 == 0 && x % 5 == 0)
                .collect(Collectors.toList());
                return integerNumbers;
    }
}
