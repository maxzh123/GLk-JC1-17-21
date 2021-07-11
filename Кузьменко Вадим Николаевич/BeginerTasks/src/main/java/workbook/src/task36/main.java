package task36;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        season Season = season.SUMMER;
        if (Season == season.SPRING) Season = season.SUMMER;
        else if (Season == season.SUMMER) Season = season.AUTUMN;
        else if (Season == season.AUTUMN) Season = season.WINTER;
        else if (Season == season.WINTER) Season = season.SPRING;

        System.out.println(Season);
    }
}

