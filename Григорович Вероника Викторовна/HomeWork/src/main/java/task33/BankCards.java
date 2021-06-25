package task33;

public interface BankCards {
    String getType();
    public int monthlyPaymentByInstallment();
    public int addMoney();
    public int takeOffMoney();
    public int repayCredit(); //погасит очередной платеж по кредиту
    public boolean issueInstallment(); //оформить рассрочку
    public String сheckingSolvency(); //проверка погашения кредита
    public void printInfo();

}

