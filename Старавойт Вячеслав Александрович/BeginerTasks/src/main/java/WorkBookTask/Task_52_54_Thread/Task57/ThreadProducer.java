package WorkBookTask.Task_52_54_Thread.Task57;

public class ThreadProducer implements Runnable{

    @Override
    public void run() {
        while (Runner.count>0) {
            Runner.ManagerThread("add");
        }

    }
}
