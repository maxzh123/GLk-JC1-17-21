import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//Условно верно. формально в задание не указано что данные недурнобы готовить через стрим апи.
public class task63 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        boolean result = numbers.stream()
                .anyMatch(i -> i%3==0 && i%5==0);
        System.out.println(result);

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

