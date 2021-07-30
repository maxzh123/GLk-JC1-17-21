package tasks55_57;
// создать метод который печатает название потока и засыпает на две секунды. Запустить одновременно 10 потоков.
//реализовать механизм синхронизации, чтобы все потоки выполнились последовательно

public class Task55 {
    public static void main(String[] args) throws InterruptedException {
        createThread(10);
    }
    public static void createThread(int count) {
        ThreadTask55 threadTask55=new ThreadTask55();
        for (int i = 0; i < count; i++) {
            Thread t=new Thread(threadTask55);
            t.setName("я поток номер "+i);
            t.setDaemon(false);
            t.start();
        }
    }



}
