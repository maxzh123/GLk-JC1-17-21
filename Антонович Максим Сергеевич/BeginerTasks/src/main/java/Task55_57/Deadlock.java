package Task55_57;

public class Deadlock implements Runnable {

    Subjects subjects = new Subjects();

    public void run() {

       subjects.takeTools();
       subjects.getANail();
       subjects.hammerANail();

    }

}
