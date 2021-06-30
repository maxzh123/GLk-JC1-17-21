package main.java.Task24;

public class runner {
    public static void main(String[] args) {
        Time h1 = new Time(12, 14, 2);
        Time h2 = new Time(45, 45, 2);
        Time h3 = new Time(14, 22, 33);
        Time h4 = new Time(4534543);
        System.out.println(h3);
        System.out.println(h1);
       System.out.println(h1.compareTo(h3));
       System.out.println(h1.compareTo(h4));
    }
}
