package workbook;

import java.util.ArrayList;

public class task39 {
    public static void main(String[] args) {
        ArrayList<String>score = new ArrayList<String>();
        score.add("10");
        score.add("4");
        score.add("5");
        score.add("3");
        score.add("5");
        score.add("1");
        score.add("2");
        score.add("5");
        score.add("8");
        score.add("7");

        score.remove("1");
        score.remove("2");
        score.remove("3");
        score.remove("4");

        Object[] scoreArray = score.toArray();
        for (Object scor : scoreArray) {
            System.out.println(scor);
        }
    }
}
