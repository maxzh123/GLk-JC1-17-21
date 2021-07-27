package Task34;

public class Workfolk extends AbstractWorker {
    private int hourlyPayment=10;

    public Workfolk(int money, String name) {
        super(money, name);
    }

    @Override
    public int salary() {
        return super.salary()*hourlyPayment;
    }
}
