import java.util.ArrayList;
import java.util.List;

public class task63 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers);
        for (int i : filtered) {
            System.out.println(i);
        }
    }
       private static List<Integer> filter (List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i%2==0 && i%5==0) {
                result.add(i);
            }
        }
return result;
    }
}

