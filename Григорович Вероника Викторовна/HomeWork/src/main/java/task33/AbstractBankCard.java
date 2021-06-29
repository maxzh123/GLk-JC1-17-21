package task33;

public class AbstractBankCard implements BankCards{
    protected String type;

    public AbstractBankCard(String type) {
        this.type = type;
    }

    @Override
    public String getType()
        {
            return type;
        }

    @Override
    public int addMoney() {
        return 0;
    }

    @Override
    public int takeOffMoney() {
        return 0;
    }

    @Override
    public int repayCredit() {
        return 0;
    }

    @Override
    public int issueInstallment() {
        return 0;
    }

    @Override
    public void CheckingSolvency() {

    }
}
