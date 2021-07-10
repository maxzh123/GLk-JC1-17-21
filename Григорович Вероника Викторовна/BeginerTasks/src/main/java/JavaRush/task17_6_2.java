package JavaRush; //метод weekend должен определять является ли localDateTimes выходным. Выходной с пятницы 22:00 вклюяительно, по воскресенье 23:00 исключительно

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class task17_6_2 {
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;


    public static void main(String[] args) {
        List<LocalDateTime> localDateTimes=new ArrayList<>();
        localDateTimes.add(LocalDateTime.of(2016,4,22,18,38));
        localDateTimes.add(LocalDateTime.of(2016,4,22,21,59));
        localDateTimes.add(LocalDateTime.of(2016,4,22,22,0));
        localDateTimes.add(LocalDateTime.of(2016,4,23,5,0));
        localDateTimes.add(LocalDateTime.of(2016,4,24,22,59));
        localDateTimes.add(LocalDateTime.of(2016,4,24,23,0));
        localDateTimes.add(LocalDateTime.of(2016,4,25,11,5));

        for(LocalDateTime times: localDateTimes) {
            System.out.println(times+ " , is weekend - "+ isWeekend(times));
        }
    }

    public static boolean isWeekend(LocalDateTime time) {
        int day=time.getDayOfWeek().getValue();
        if (day==FRIDAY && time.getHour()>=WEEKEND_START_FRIDAY_CUT_OFF_HOUR) {
            return true;
        } else if (day==SUNDAY && time.getHour()<WEEKEND_END_SUNDAY_CUT_OFF_HOUR) {
            return true;
        } else if (day==SATURDAY) {
            return true;
        } else {
            return false;
        }
    }
}
