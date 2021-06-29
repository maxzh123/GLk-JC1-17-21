package task33;

public interface BankCards {
    String getType();
    public int addMoney();
    public int takeOffMoney();
    public int repayCredit(); //погасит очередной платеж по кредиту
    public int issueInstallment(); //оформить рассрочку
    public void CheckingSolvency(); //проверка погашения кредита

}

