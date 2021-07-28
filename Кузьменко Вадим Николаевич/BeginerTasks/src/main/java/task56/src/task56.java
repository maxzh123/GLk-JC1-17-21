public class task56 {
    public static void main(String[] args) throws Exception {
        WordA wordA = new WordA();
        WordB wordB = new WordB();
        WordC wordC = new WordC();
        wordA.wordB = wordB;
        wordB.wordA = wordA;
        wordC.wordA = wordA;
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        myThread1.wordA = wordA;
        myThread2.wordB = wordB;
        myThread3.wordC = wordC;
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}

class MyThread1 extends Thread {
    WordA wordA;

    @Override
    public void run () {
        System.out.println (wordA.getI());
    }
}

class MyThread2 extends Thread {
    WordB wordB;

    @Override
    public void run () {
        System.out.println (wordB.getI());
    }
}
class MyThread3 extends Thread {
    WordC wordC;

    @Override
    public void run () {
        System.out.println (wordC.getI());
    }
}

class WordA {
    WordB wordB;
    public synchronized int getI() {
        return wordB.returnI();
    }
    public synchronized  int returnI(){
        return 1;
    }
}
class WordB {
    WordA wordA;
    public synchronized int getI() {
        return wordA.returnI();
    }
    public synchronized  int returnI(){
        return 2;
    }
}
class WordC {
    WordA wordA;
    public synchronized int getI() {
        return wordA.returnI();
    }
    public synchronized  int returnI(){
        return 3;
    }
}