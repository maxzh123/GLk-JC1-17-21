package WorkBookTask.Task_33;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        AbstractCard[] array = new AbstractCard[]{new DebitCardAlfaBank("Дебетовая", 5, "Альфа банк"), new CreditCardPriorbank("Кредитная", 7, "Приорбанк", "Овердрайф")};
        for (int i = 0; i < array.length; i++) {
            array[i].talkAboutMyself();
            array[i].printInfoPay();
            array[i].printInfoCard();
            System.out.println("-------------------------------------------------------------");
        }
    }
}
