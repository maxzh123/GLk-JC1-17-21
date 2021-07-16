package task31;

public class Timer {

    public static long doTest(Tester t){
        System.gc();
        long start=System.currentTimeMillis();
        t.doWork();
        return System.currentTimeMillis()-start;
    }
}
