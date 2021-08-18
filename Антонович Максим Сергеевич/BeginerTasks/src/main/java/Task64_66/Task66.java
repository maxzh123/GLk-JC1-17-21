package Task64_66;

import java.time.LocalDate;

public class Task66 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("дата 60 дней назад: "+ today.minusDays(60));
    }
}
