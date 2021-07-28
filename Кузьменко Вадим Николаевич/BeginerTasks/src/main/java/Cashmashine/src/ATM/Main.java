package ATM;

public class Main {

        public static void main(String[] args) {
            ATM atm = new ATM(1000);

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    atm.withdraw("Андрей", 300);
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atm.withdraw("Алексей", 500);
                }
            });

            Thread thread3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        thread2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atm.withdraw("Лошка", 400);
                }
            });

            thread1.start();
            thread2.start();
            thread3.start();
        }
    }


