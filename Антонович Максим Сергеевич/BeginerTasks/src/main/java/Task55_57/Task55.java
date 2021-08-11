package Task55_57;


public class Task55 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread ar = new Thread(new ThreadForTask55());
            ar.start();
            ar.join();
        }
    }
}