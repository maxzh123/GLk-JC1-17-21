import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task64 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введи номер месяца");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Integer.parseInt(s.nextLine()));
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.YEAR, 2020);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        SimpleDateFormat df = new SimpleDateFormat("d::MMM::uuuu");
        System.out.print(df.format(cal.getTime()));
        for (int i = 1; i < maxDay; i++) {
            cal.set(Calendar.DAY_OF_MONTH, i + 1);
            System.out.println(df.format(cal.getTime()));
        }
    }
}

