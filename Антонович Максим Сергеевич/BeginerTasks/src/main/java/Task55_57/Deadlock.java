package Task55_57;

//FIXME дедлока не произойдет. все выполнится в одном потоке и последовательно.
public class Deadlock implements Runnable {

    Subjects subjects = new Subjects();

    public void run() {

       subjects.takeTools();
       subjects.getANail();
       subjects.hammerANail();

    }

}
