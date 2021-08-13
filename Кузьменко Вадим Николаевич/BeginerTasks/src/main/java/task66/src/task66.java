import java.time.LocalDate;

//FIXME задание вывести ежедневно в течении 2-х месяцев, в не 1 раз 60 дней назад.
public class task66 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        a = a.minusDays(60);
        System.out.println(a);
    }
}
