package Task34;

public class Manager extends Workfolk {
    private int aw = 2;
    private double index = 2.5;

    public double annualPremium (){
        double Bonus =  index*305; //305 - кол-во рабочих дней в 2021
        return Bonus;
    }

    public Manager(int money, String name) {
        super(money, name);
    }

    @Override
    public int salary() {
        return super.salary()*aw;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Годовой бонус"+annualPremium());
    }
}
