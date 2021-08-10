package Task52_54;

public class Task54 {
    public static void main(String[] args)  {
        for (int i = 0; i < 5; i++) {
            Thread ar = new Thread(new ThreadForTask54());
            ar.start();
        }
    }
}