package Tasks67_69Patterns.Task68Syngleton;

import Tasks67_69Patterns.Task68Syngleton.MySingleton;

public class RunnerTask67 {
    public static void main(String[] args) {
        MySingleton ms=MySingleton.getInstance();
        System.out.println(ms.getCurrentDate());
    }
}
