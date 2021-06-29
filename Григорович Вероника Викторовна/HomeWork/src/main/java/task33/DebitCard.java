package task33;

public class DebitCard extends AbstractBankCard{
    public static int salary;
    int sum;

    public DebitCard(String type, int sum) {
        super(type);
        this.sum =sum;
    }
    @Override
    public String getType()
    {
        return "зарплатная карточка";
    }

    @Override
    public int addMoney() {
        return sum+salary;
    }
    @Override
    public int takeOffMoney() {
        return (sum-(int)(0.9*sum)); //откладываем 10 процентов с зарплаты
    }
}
