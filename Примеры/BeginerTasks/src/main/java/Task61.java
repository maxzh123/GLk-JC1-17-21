import java.util.stream.IntStream;

public class Task61 {
    public static void main(String[] args) {
        System.out.println(
          IntStream.range(1,21).filter(x->x%2==0).peek(System.out::println).mapToDouble(x->x/2.54).sum()
        );
    }
}
