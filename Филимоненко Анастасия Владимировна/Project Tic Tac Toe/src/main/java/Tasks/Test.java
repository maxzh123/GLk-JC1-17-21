package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        CashCard card1 = new CashCard("Иванов", 1111, 9000);
        CashCard card2 = new CashCard("Петров", 1234, 100);
        CashCard card3 = new CashCard("Сидоров", 6969, 1000000);

        Set<CashCard> cashCards = new HashSet<>();
        cashCards.add(card1);
        cashCards.add(card2);
        cashCards.add(card3);

        new ATM(cashCards).run();
    }
}
