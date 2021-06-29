package PreviousTasks;

public class task5 {
    public static void main (String [] args) {
        int sec = 604800;
        time(sec);
    }
        public static void time(int s) {
        int sec=s%60;
        int m=(s-sec)/60;
        int min=m%60;
        int h=(m-min)/60;
        int hour=h%24;
        int d=(h-hour)/24;
        int day=d%24;
        int week=(d-day)/7;

            System.out.println(week+ " недель " +day+" дней "+hour+" часов " + min + " минут " + sec + " секунд");
    }
    }

