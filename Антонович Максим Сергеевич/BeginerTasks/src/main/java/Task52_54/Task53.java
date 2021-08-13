package Task52_54;

//FIXME и с высокой ероятностью потоки убьются, ибо им не сказали что они не демоны.
public class Task53 {
    public static void main(String[] args) {
        NewThreadForTask53 t1 = new NewThreadForTask53();
        NewThreadForTask53 t2 = new NewThreadForTask53();
        NewThreadForTask53 t3 = new NewThreadForTask53();
        NewThreadForTask53 t4 = new NewThreadForTask53();
        NewThreadForTask53 t5 = new NewThreadForTask53();
        NewThreadForTask53 t6 = new NewThreadForTask53();
        NewThreadForTask53 t7 = new NewThreadForTask53();
        NewThreadForTask53 t8 = new NewThreadForTask53();
        NewThreadForTask53 t9 = new NewThreadForTask53();
        NewThreadForTask53 t10 = new NewThreadForTask53();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
    }

