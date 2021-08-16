package Tasks67_69Patterns.Task68Syngleton;

public class RunnerTask67 {
    public static void main(String[] args) {
        MySingleton ms= MySingleton.getInstance();
        System.out.println(ms.getCurrentDate());
        MySingleton ms1= MySingleton.getInstance();
        System.out.println(ms1.getCurrentDate());
    }
}
