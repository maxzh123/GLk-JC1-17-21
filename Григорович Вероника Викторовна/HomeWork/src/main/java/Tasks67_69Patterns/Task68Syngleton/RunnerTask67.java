package Tasks67_69Patterns.Task68Syngleton;

import Tasks67_69Patterns.Task68Syngleton.MySingleton;

import java.time.LocalDate;

public class RunnerTask67 {
    public static void main(String[] args) {
        LocalDate ms=MySingleton.getInstance();
        System.out.println(ms);
    }
}
