import java.util.ArrayList;
import java.util.List;

public class task63 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, a -> a%3==0 && a%5==0);
        for (int i : filtered) {
            System.out.println(i);
        }
    }
       private static List<Integer> filter (List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
return result;
    }
}

