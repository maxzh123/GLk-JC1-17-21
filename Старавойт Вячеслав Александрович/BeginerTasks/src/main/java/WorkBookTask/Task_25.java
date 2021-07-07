package WorkBookTask;


import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(30,34,50);
        /*А зачем нам банкомат сплетница? зачем он нам рассказывает про чужие банкоматы?
        я бы в такой карту не сунул. нормальный банкомат отвечает только за себя
        параметр - снести к чертям, пусть из this берет
        * */
        cashMachine.printInformation(cashMachine);
        } // наш банкомат по приветствовал;
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
             System.out.println("_____________________________________________________________");
             System.out.println("Мы рады приветствовать Вас!");
             System.out.println("Надеемся наш сервис удивит вас.");
             System.out.println("_____________________________________________________________");
             System.out.println();
             System.out.println("  <<< Если хотите ДОБАВИТЬ деньги в банкомат >>>  нажмите: 1");
             System.out.println(" <<< Если хотите СНЯТЬ деньги из банкомата >>>    нажмите: 2");
             System.out.println("              <<< Если вы закончили>>>> нажмите: 3");
             //А какого лешего наш банкомат занимается не своим делом? кто ему вообще позволит команды сканить. он банкомат. пусть выполняет свою работу, а команды пусть сканит и отдает ему кто-то другой. Микроволновка же не лазит в холодильник сама.
             commandScanner(cashMachine);
         }
         // в отдельный класс либо сделать статиком и дергать из мэйна.
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
                 moneyBox(countTwenty,countFifty,countHundred);

             }
             else {
                 System.out.println("Операция не удалась! Ошиблись при вводе.");
                 moneyBox(0,0,0);
             }
             System.out.println("__________________________________________________________________________");
             //Так нельзя. вы зацикливаетесь через рекурсию. когда у вас упадет ошибка злобный тестер закажет вагон бумаги и распечатает ваш стектрейс. А потом забросит вас в этот вагон и подожжет.
             // сделайте в мэйне while (cacheMachine.isAlive()){читайте команду. говорите банкомату че делать.}
             printInformation(cashmachine);
         }

         public void moneyBox(int countTwenty, int countFifty, int countHundred  ) { // метод копилка который будет держать баланс банкомата  и номинал купюр.
             this.twenty_20+=countTwenty;
             this.fifty_50+=countFifty;
             this.hundred_100+=countHundred;
             this.sum += (countTwenty*20 +countFifty*50 + countHundred*100);}

         public void printMoneyBox(){
             System.out.println("Баланс банкомата: " + this.sum);
             System.out.println(" Номинал 20$ : " + this.twenty_20 + " штук !  " + " Номинал 50$ : " + this.fifty_50 + " штук !  " + " Номинал 100$ : " + this.hundred_100 + " штук !" );
         }


         public void cashOut(CashMachine cashmachine) { // наш метод на вывод денег
             Scanner scanner = new Scanner(System.in);
             System.out.println("Введите желаюмую сумму для снятия: ");
             int money = scanner.nextInt();
             if (verificationCashOut(money) && oddMoney(money)) {
                 System.out.println("__________________________________________________");
                 System.out.println("Операция удалась?  : " + oddMoney(money));
                 System.out.println("Заберите ваши деньги: " + money + " долларов");
             } else {
                 System.out.println("___________________________________________________");
                 System.out.println("Операция удалась?  : " + oddMoney(money));
                 System.out.println("Данной суммы нет в банкомате,или неправильно ввели сумму( не кратно 20 или 50) простите, приходите позже");
                 printMoneyBox();
             }
             //выше написано
             printInformation(cashmachine);
         }
         public boolean oddMoney(int sumOut){
          int par_20=20;
          int par_50= 50;
          int par_100=100;
          int count_20=0;
          int count_50=0;
          int count_100=0;
          while(sumOut>=par_100 && count_100<this.hundred_100 && ((sumOut-100)%20==0)){
              count_100+=1;
              sumOut-=100;
          }
          while(sumOut>=par_50 && count_50<=this.fifty_50 && ((sumOut-50)%20==0)){
                 count_50+=1;
                 sumOut-=50;
             }
          while(sumOut>=par_20 && count_20<=this.twenty_20 ){
                 count_20+=1;
                 sumOut-=20;
             }
          if (sumOut==0){
              moneyBox(-count_20,-count_50,-count_100);
              printOddMoney(count_20,count_50,count_100);
          }
          else {
              moneyBox(0,0,0);
              return false; }
          return true;
          }

          public void printOddMoney(int par_20,int par_50,int par_100){
              System.out.println(" Номинал 20$ : " + par_20+ " штук !  " + " Номинал 50$ : " + par_50 + " штук !  " + " Номинал 100$ : " + par_100 + " штук !" );
          }


         public boolean verificationCash(int sumAdd) { // Метод проверки и подтверждения операции
             return (sumAdd > 0); // проверка изменилась ли сумма ввода чтобы подтвердить операции
         }

         public boolean verificationCashOut(int money) { // Метод проверки и подтверждения операции
             return (this.sum >= money && money > 0   ); // условием что есть деньги в банкомате.
         }


}

