package Threads;

public abstract class Task53 {
    public static void main(String[] args)  throws InterruptedException {
        createThread(1000);
    }


    public static void createThread(int count){
        NewThread newThread =new NewThread();
        for (int i=0; i<count;i++){
            Thread nt = new Thread(newThread);
            nt.setName("Stream № " + i);
            nt.setDaemon(false);
            nt.start();
        }
    }

    public abstract void run();
}
