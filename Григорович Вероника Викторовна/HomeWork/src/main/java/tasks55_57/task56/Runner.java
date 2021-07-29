package tasks55_57.task56;
//надо было реализовать дедлок между тремя потоками
public class Runner {
    public static String test1= new String();
    public static String test2= new String();
    public static String test3= new String();

    public static void main(String[] args) {
        TestThread1 testThread1=new TestThread1();
        TestThread2 testThread2=new TestThread2();
        TestThread3 testThread3=new TestThread3();
        testThread1.start();
        testThread2.start();
        testThread3.start();
    }
}
