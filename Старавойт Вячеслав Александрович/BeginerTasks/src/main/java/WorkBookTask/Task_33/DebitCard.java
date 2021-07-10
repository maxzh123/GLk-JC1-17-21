package WorkBookTask.Task_33;

public class DebitCard extends AbstractCard {

    public DebitCard(String name, int validityPeriod, String nameBank) {
        super(name, validityPeriod,nameBank);
    }
    @Override
    public void printInfoPay(){
        System.out.println("Это картой можно оплатить, только при наличи денег на счете ");
    }
}
