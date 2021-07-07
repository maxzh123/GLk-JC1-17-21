package task25;

public class BPSbank extends AbstractBank{
    public BPSbank(MoneyBox... boxes) {
        super.loadMoney(boxes);
    }
    @Override
    public void printMenu() {
        System.out.println("______________________ БПС сбербанкбанк __________________________");
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
