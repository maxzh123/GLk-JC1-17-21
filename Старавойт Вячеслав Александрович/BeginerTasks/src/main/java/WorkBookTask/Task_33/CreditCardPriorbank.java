package WorkBookTask.Task_33;

public class CreditCardPriorbank extends CreditCard {

    public CreditCardPriorbank(String name, int validityPeriod, String nameBank, String overdraft) {
        super(name, validityPeriod, nameBank, overdraft);
    }

    @Override
    public void printInfoCard(){
        System.out.println("Наша кредитная карта от Приорбанка очень мощная. Сделает запросто вас нищими.");
    }
}
