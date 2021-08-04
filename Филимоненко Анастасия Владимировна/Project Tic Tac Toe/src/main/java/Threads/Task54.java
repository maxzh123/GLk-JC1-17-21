package Threads;

public class Task54 {
    public static void main(String[] args)  {
        for (int i = 0; i < 5; i++) {
            Thread ar = new Thread(new NewThread2());
            ar.start();
        }
    }
}
