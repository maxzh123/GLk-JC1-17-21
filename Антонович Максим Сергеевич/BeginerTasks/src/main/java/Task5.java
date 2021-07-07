import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");
        int b = number.nextInt();
        result(b);
    }
    static String result (int a) {
        double b = a/3600;
        if (b<=0) {
            int min = a/60;
            int sec = a - (min*60);
            String t = "min: " + min +"\nsec: "+sec;
            System.out.println(t);
            return t;
        }else {
            int hours =a/3600;
            int min = (a - (hours*3600))/60;
            int sec = (a - ((min*60)+(hours*3600)));
            String t = "hours: "+hours+"\nmin: " + min +"\nsec: "+sec;
            System.out.println(t);
       return t;
    }
}
}
