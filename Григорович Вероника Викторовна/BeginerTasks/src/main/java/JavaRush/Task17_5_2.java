package JavaRush;

import java.time.LocalTime;

public class Task17_5_2 {
    public static void main(String[] args) throws InterruptedException { //тут надо было чтобы while сработал только 4 раза
        LocalTime localTime=LocalTime.MIDNIGHT;
        System.out.println(localTime);
        LocalTime next=amaxingMethod(localTime);
        while (next.isAfter(localTime)) { // до тех пор пока next перед local time
            System.out.println(next);
            next=amaxingMethod(next);
            Thread.sleep(500);
        }
    }
    static LocalTime amaxingMethod(LocalTime base) {
        return base.plusMinutes(288);
    }
}
