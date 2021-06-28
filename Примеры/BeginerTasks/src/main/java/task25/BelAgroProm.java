package task25;

public class BelAgroProm  extends AbstractBank{

    public BelAgroProm(MoneyBox... boxes) {
        super.loadMoney(boxes);
    }

    @Override
    public void printMenu() {
        System.out.println("______________________ БелаАГопгом банк __________________________");
        super.printMenu();
        System.out.println("______________________ купюры и количество __________________________");
        if (boxes!=null){
            for (MoneyBox m:boxes){
                System.out.println(m);
            }
            System.out.println("________________________________________________");
        }

    }

}
