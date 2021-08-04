package WorkBookTask.Task_52_54_Thread.Task53;


public class Runner {

    public static void main(String[] args)  throws InterruptedException {
             createThread(1000);
        }


     public static void createThread(int count){
        NewThread newThread =new NewThread();
        for (int i=0; i<count;i++){
            Thread nt = new Thread(newThread);
            nt.setName("Меня зовут поток под номером № " + i);
            nt.setDaemon(false);
            nt.start();
        }
     }
    }

