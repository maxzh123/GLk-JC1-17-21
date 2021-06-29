package task33;

public class Runner {
    public static void main(String[] args) {
        AbstractBankCard [] abstractBankCards=new AbstractBankCard[]{(new DebitCard("зарплатная карточка", 500)),
                (new CreditCard("кредитная карточка",500,200)),
        new InstallmentCard("карта рассрочки", 500, 200,12,400)};
        for (int i = 0; i < abstractBankCards.length; i++) {
            abstractBankCards[i].printInfo();
        }
    }
}
