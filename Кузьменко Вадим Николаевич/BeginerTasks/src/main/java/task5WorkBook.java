public class ch {
   int timeSecond;

    void ShowTime () {
        int minutes = timeSecond / 60;
        int hour = timeSecond / 3600;
        int day = hour / 24;
        int week = day / 7;

        System.out.println( "Минут"+ " " + minutes);
        System.out.println( "Часов" + " " + hour);
        System.out.println( "Дней" + " " + day);
        System.out.println( "Недель" + " " + week);


    }
}



