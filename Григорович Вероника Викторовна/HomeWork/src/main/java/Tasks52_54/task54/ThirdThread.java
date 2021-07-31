package Tasks52_54.task54;



import java.util.Random;

public class ThirdThread implements Runnable {
    @Override
    public void run() {


        NewArray.array=new Random()
                .ints(10,0,100)
                .toArray();
        Writer1.writeInFile(CreateFiles.file);
        System.out.println("Работает поток "+Thread.currentThread().getName());
    }
    }

