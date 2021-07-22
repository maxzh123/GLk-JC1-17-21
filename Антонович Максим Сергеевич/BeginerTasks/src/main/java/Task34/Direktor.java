package Task34;

public class Direktor extends Manager {

    private double index = 5;
    public Direktor(int money, String name) {
        super(money, name);
    }

    @Override
    public int salary() {
        return super.salary();
    }

    @Override
    public double annualPremium() {
        return super.annualPremium()*index;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
