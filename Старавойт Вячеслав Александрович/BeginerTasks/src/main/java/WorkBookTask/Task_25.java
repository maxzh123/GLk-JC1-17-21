package WorkBookTask;


import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(100, 20, 30);// некое количество денег с покупкой банкомата
        cashMachine.printInformation(cashMachine); // наш банкомат по приветствовал;
    }

}

     class CashMachine extends Task_25 { // создим класс Банкомат
         private int twenty_20;
         private int fifty_50;
         private int hundred_100;
         private int sum;

      public CashMachine(int twenty_20,int fifty_50,int hundred_100){ //мой конструктор с количеством купюр
       this.twenty_20=twenty_20;
       this.fifty_50=fifty_50;
       this.hundred_100=hundred_100;
       this.sum=twenty_20 *20 + fifty_50 * 50 + hundred_100 * 100;  // общее количество денег в банкомате

     }

         public void printInformation(CashMachine cashMachine) { // обязательно void иначе метод не будет вызываться
             System.out.println("Мы рады приветствовать Вас!");
             System.out.println("Надеемся наш сервис удивит вас.");
             System.out.println("_____________________________________________________________");
             System.out.println();
             System.out.println("  <<< Если хотите ДОБАВИТЬ деньги в банкомат >>>  нажмите: 1");
             System.out.println(" <<< Если хотите СНЯТЬ деньги из банкомата >>>    нажмите: 2");
             System.out.println("              <<< Если вы закончили>>>> нажмите: 3");
             commandScanner(cashMachine);
         }

         public void commandScanner(CashMachine cashMachine) { //Метод-мозг который будет решать куда и кого распределить, обязательно надо передать наш объект этому методу.
             Scanner scanner = new Scanner(System.in);
             int number = scanner.nextInt();
             if (number == 1) {
                 cashMachine.addCash(cashMachine); // отправили в метод чтобы пользователь добавил денег
             } else if (number == 2) { // отправим в метод чтобы пользователь снял деньги
                 cashMachine.cashOut(cashMachine);
             }
         }


         public void addCash(CashMachine cashmachine) { // наш метод на добавление денег
             System.out.println("Пожалуйста введите сколько денег хотите добавить(20,50,100), если нет купюр такого номинала жмем>>> '0' ");
             System.out.println("Введите кол-во купюр номиналом '20': ");
             Scanner scanner = new Scanner(System.in);
             int countTwenty = scanner.nextInt();
             System.out.println("Введите кол-во купюр номиналом '50': ");
             int countFifty = scanner.nextInt();
             System.out.println("Введите кол-во купюр номиналом '100': ");
             System.out.println();
             int countHundred = scanner.nextInt();
             if (countTwenty >= 0 && countFifty >= 0 && countHundred >= 0) {
                 int sumAdd = countTwenty * 20 + countFifty * 50 + countHundred * 100;
                 System.out.println("Операция удалась? : " + verificationCash(sumAdd)); // отправили в булевый метод проверить или операция удалась.
                 System.out.println(" Вы внесли всего денег: " + sumAdd);
                 moneyBox(sumAdd);
             }           //метод где добавляем деньги
             else {
                 System.out.println("Операция не удалась! Ошиблись при вводе.");
                 moneyBox(0);
             }
             System.out.println("__________________________________________________________________________");
             printInformation(cashmachine);
         }

         public void moneyBox(int sum) { // метод копилка который будет держать баланс банкомата
             this.sum += sum;
             System.out.println("Баланс банкомата: " + this.sum);
         }


         public void cashOut(CashMachine cashmachine) { // наш метод на вывод денег
             Scanner scanner = new Scanner(System.in);
             System.out.println("Введите желаюмую сумму для снятия: ");
             int money = scanner.nextInt();
             if (verificationCashOut(money) && money > 0) {
                 System.out.println("Операция удалась?  : " + verificationCashOut(money));
                 System.out.println("Заберите ваши деньги: " + money + " долларов");
                 moneyBox(-money); //отправили в копилку снимать деньги, если сумма не превышает баланс
             } else {
                 System.out.println("Операция удалась?  : " + verificationCashOut(money));
                 System.out.println("Данной суммы нет в банкомате,или неправильно ввели сумму простите, приходите позже");
                 moneyBox(0);
             }
             printInformation(cashmachine);
         }


         public boolean verificationCash(int sumAdd) { // Метод проверки и подтверждения операции
             return (sumAdd > 0); // проверка изменилась ли сумма ввода чтобы подтвердить операции
         }

         public boolean verificationCashOut(int sumOut) { // Метод проверки и подтверждения операции
             return (this.sum >= sumOut && sumOut >= 0); // условием что есть деньги в банкомате.
         }


}