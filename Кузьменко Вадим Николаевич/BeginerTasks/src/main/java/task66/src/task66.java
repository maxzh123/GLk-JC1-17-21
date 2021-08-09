import java.time.LocalDate;

public class task66 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        a = a.minusDays(60);
        System.out.println(a);
    }
}
