package JavaRush;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task17_5_1 {
    static LocalTime timeMax=LocalTime.MAX;
    static LocalTime timeMin=LocalTime.MIN;
    static LocalTime time1=LocalTime.of(14, 0);;
    static LocalTime time2=LocalTime.of(7,0,8);;
    static LocalTime time3=LocalTime.of(0,45,0,61);;


    public static void main(String[] args) {

        System.out.println(LocalTime.of(time1.getHour(),0, time2.getSecond(), time3.getNano()));


    }
}
