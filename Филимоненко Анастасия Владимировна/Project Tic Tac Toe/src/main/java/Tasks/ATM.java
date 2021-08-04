package Tasks;

import java.util.Scanner;
import java.util.Set;

public class ATM {
    private Set<CashCard> cashCards;

    public ATM(Set<CashCard> cashCards) {
        this.cashCards = cashCards;
    }

    public void setCashCards(Set<CashCard> cashCards) {
        this.cashCards = cashCards;
    }

    public void run() {
        do {
            // вечно горящая надпись на екране банкомата
            System.out.println("Вставьте карту");
            Scanner inputCardScanner = new Scanner(System.in);

            // симулируем вставку карточки нажатием клавиши Enter
            String inputCard = inputCardScanner.nextLine();

            System.out.println("Введите фамилию");
            String lastName = inputCardScanner.nextLine();

            System.out.println("Введите пинкод");
            int pinCode = inputCardScanner.nextInt();

            CashCard cashCardToCheck = new CashCard(lastName, pinCode, 0);

            if (!cashCards.contains(cashCardToCheck)) {
                System.out.println("Неправильно введена фамилия или пинкод!");

                // выплюнуть карту
                continue;
            } else {
                // основное меню, которое можно расширять, но тогда использовать
                // шаблон команда
                do {
                    System.out.println("Введите сумму для снятия или 0 для выхода");
                    int moneyAmount = inputCardScanner.nextInt();
                    if (moneyAmount == 0)
                        break;
                    try {
                        for (CashCard cashCard : cashCards) {
                            if (cashCard.equals(cashCardToCheck)) {
                                System.out.println("С вашего счета было снято " +
                                        cashCard.takeMoney(moneyAmount));

                                System.out.println("На вашем счету осталось "
                                        + cashCard.getBalance());
                                break;
                            }
                        }
                    } catch (NotEnoughMoneyException e) {
                        System.out.println("На вашем счету недостаточно денег");
                    }
                } while (true);
            }
        } while (true);
    }
}
