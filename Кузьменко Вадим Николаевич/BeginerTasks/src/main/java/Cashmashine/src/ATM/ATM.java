package ATM;

public class ATM {

        private int amount;
        private final Object monitor = new Object();

        public ATM(int amount) {
            this.amount = amount;
        }

        public void withdraw(String name, int amount) {
            synchronized (monitor) {
                System.out.println(name + " Подошел к банкомату");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (amount <= this.amount) {
                    this.amount -= amount;
                    System.out.println(name + " вывел " + amount);
                    System.out.println("Осталось: " + this.amount);
                } else {
                    System.out.println("В банкомате недостаточно денег для " + name);
                }
            }
        }
    }

