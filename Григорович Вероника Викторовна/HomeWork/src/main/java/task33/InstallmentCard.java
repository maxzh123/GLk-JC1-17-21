package task33;

public class InstallmentCard extends CreditCard {

int months; // на сколько месяцев берем рассрочку
    int sumInstallment;

    public InstallmentCard(String type, int cardBalance, int loanPayment, int months, int sumInstallment) {
        super(type, cardBalance, loanPayment);
        this.months = months;
        this.sumInstallment = sumInstallment;
    }


    @Override
    public String getType() {
        return "карта рассрочки";
    }

    @Override
    public boolean issueInstallment() {// можем взять рассрочку или нет
        if(repayCredit()>salary/2)
            return true;
        else { return false; }
        }

    @Override
    public int monthlyPaymentByInstallment() {
        if (issueInstallment()) {
            return sumInstallment / months;
        } else {
            return 0;
        }
    }

    @Override
    public  void printInfo() {
        System.out.println("Это "+getType()+", ежемесячный платеж по рассрочке составляет: "
                +monthlyPaymentByInstallment());
    }
    }

