package Tasks52_54.task54;

import static Tasks52_54.task54.CreateFiles.createNewFile;

public class RunnerTask54 {
    static Thread [] threads=new Thread[5];

    public static void main(String[] args) throws InterruptedException {
        createNewFile(CreateFiles.file);
        ThirdThread third=new ThirdThread();
        for (int i = 0; i < 5; i++) {
            threads[i]=new Thread(third);
            threads[i].setName("номер "+i);
            threads[i].start();
            System.out.println("Работает поток "+Thread.currentThread().getName());
        }
    }
}
