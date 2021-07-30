package WorkBookTask.Task_52_54_Thread.Task57;

public class ThreadConsumer implements Runnable{


    @Override
    public void run() {
        while (Runner.count>0) {
            Runner.ManagerThread("take");
        }
    }
}
