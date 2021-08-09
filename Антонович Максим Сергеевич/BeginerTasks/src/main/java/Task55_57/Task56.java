package Task55_57;

public class Task56 {
    public static void main(String[] args) {
        Deadlock workWithSubjects = new Deadlock();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(workWithSubjects, "thread"+i);
         thread.start();
        }
    }
}
