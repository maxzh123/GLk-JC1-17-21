package task33;


public class CreditCard extends AbstractBankCard{
    int loanPayment; //ежемесячный платеж по кредиту
    public CreditCard(String type, int loanPayment) {
        super(type);
        this.loanPayment = loanPayment;
    }
    @Override
    public int repayCredit() {
        return addMoney()-loanPayment;
    }

    public void CheckingSolvency() {
        if (repayCredit()>=0) {
            System.out.println("Кредит погашен");
        } else {
            System.out.println("на вашей банковской карте недостаточно средств");
        }
    }
}
