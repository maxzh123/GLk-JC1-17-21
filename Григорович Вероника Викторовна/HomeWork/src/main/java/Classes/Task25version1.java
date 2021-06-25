package Classes;

import java.util.Scanner;

public class Task25version1 {
        int banknotes20;
        int banknotes50;
        int banknotes100;
        static int count20;
        static int count50;
        static int count100;


        public Task25version1(int banknotes20, int banknotes50, int banknotes100) {
            this.banknotes20 = banknotes20;
            this.banknotes50 = banknotes50;
            this.banknotes100 = banknotes100;
        }

        public static void main(String[] args) {
            Task25version1 atm = new Task25version1(10, 5, 25);
            System.out.println("Банкомат приветствует вас, выберите операцию:\n" +
                    "для снятия денег нажмите take\n" +
                    "для добавления денег нажмите add\nдля окончания работы нажимте exit");
            count20 = atm.banknotes20;
            count50 = atm.banknotes50;
            count100 = atm.banknotes100;
            System.out.println("Изначально в банкомате "+count20+" купюр номиналом 20, " +
                    count50 + " купюр номиналом 50, " +count100+" купюр номиналом 100.");
            System.out.println("Общая сумма "+ totalSum());
            atm.userChoice(atm);
            //    totalSum(); для себя делала
        }

        public void userChoice(Task25version1 atm) {
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("take")) {
                atm.takeMoney(atm);
            } else if (answer.equalsIgnoreCase("add")) {
                addMoney();
            } else if (answer.equalsIgnoreCase("exit")) {
                System.out.println("До свидания, хорошего дня");
            } else {
                System.out.println("Пожалуйста, определитесь с выбором");
            }
        }

        public void takeMoney(Task25version1 atm) {
            int sumInAtm = Task25version1.totalSum();
            boolean bool = checkingMoney(sumInAtm); // проверяем есть ли вообще в банкомате деньги
            if (bool) {
                System.out.println("Извините, в банкомает нет денег");
                System.exit(0);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("В банкомате есть деньги, номиналом 20,50 и 100 рублей.\n" +
                    "Введите сумму, которую вы хотите снять, меньшую или равную " + Task25version1.totalSum());
            System.out.println("Если вас не устраивает сумма в банкомате, нажмите 0 для окончания работы");
            int sum = scanner.nextInt();
            if (sum>Task25version1.totalSum()) {
                System.out.println( "Введите сумму, которую вы хотите снять, меньшую или равную " + Task25version1.totalSum());
            System.exit(0); }
            if (sum == 0) {
                System.out.println("До свидания, хорошего дня");
                System.exit(0);
            }
            paymentOfTheMoney(sum);
        }


        public  void paymentOfTheMoney(int sum) { //работаем непосредственно с выдачей денег
            int sumAfterTake;
            int numberOfHundred=sum/100; //смотрим сколько 100 нам надо снять
             if (numberOfHundred>banknotes100) {
                 numberOfHundred=banknotes100;
             }
         //   System.out.println(numberOfHundred); для себя проверяла
            int numberOfFifty=(sum-(100*numberOfHundred))/50;
      //      System.out.println(numberOfFifty); для себя проверяла
            if (numberOfFifty>banknotes50) {
                numberOfFifty=banknotes50;
            }
          if (sum%50==10) {
               numberOfFifty=0;
                int numberOfTwenty=(sum-(100*numberOfHundred))/20;
           }
            int numberOfTwenty=(sum-(100*numberOfHundred)-(50*numberOfFifty))/20;
                if (sum % 20 != 0) {
                    System.out.println("Ввведите число кратное 20");
                    System.exit(1);
                }
            sumAfterTake = Task25version1.totalSum() - sum;
            count20=count20-numberOfTwenty;
            count50=count50-numberOfFifty;
            count100=count100-numberOfHundred;
            System.out.println("Сумма в банкомате после снятия " + sumAfterTake
                    +". клиенту выдано "+numberOfHundred+ " сотенных купюр, "+numberOfFifty+" купюр пятьдесят, " +
                    numberOfTwenty+" двадцаток");

       //     System.out.println(numberOfHundred+" "+numberOfFifty+" "+numberOfTwenty); для себя проверяла
        }

        public static boolean checkingMoney(int sumInAtm) {
            if (sumInAtm == 0) {
                return true;
            }
            return false;
        }

        public static void addMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Банкомат принимает купюры номиналом 20,50 и 100 рублей");
            System.out.println("Введите купюры, когда закончите вводить, введите 0");
            int money = 1;
            while (money != 0) {
                money = scanner.nextInt();
                if (money == 20) {
                    count20++;
                } else if (money == 50) {
                    count50++;
                } else if (money == 100) {
                    count100++;
                }
            }
            System.out.println("До свидания, хорошего дня");
            Classes.Task25.totalSum();
            System.out.println("В банкомате " + count20 + " купюр номиналом 20 рублей, " + count50 +
                    " купюр номиналом 50 рублей, " + count100 + " купюр номиналом 100 рублей. Общая сумма денег в банкомате " + Classes.Task25.totalSum());
        }

        public static int totalSum () {
            int totalSum = count20 * 20 + count50 * 50 + count100 * 100;
            return totalSum;
        }
    }

