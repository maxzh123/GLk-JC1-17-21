package task33;


public class CreditCard extends DebitCard{
    int loanPayment; //ежемесячный платеж по кредиту

    public CreditCard(String type, int cardBalance, int loanPayment) {
        super(type, cardBalance);
        this.loanPayment = loanPayment;
    }


    @Override
    public String getType()
    {
        return "кредитная карточка";
    }
    @Override
    public int repayCredit() {
         return addMoney() - takeOffMoney() - loanPayment;

        
    }

    public String сheckingSolvency() {
        if (repayCredit()>=0) {
            return "Кредит погашен.";
        } else {
            return "На вашей банковской карте недостаточно средств.";
        }
    }

    @Override
    public  void printInfo() {
        System.out.println("Это "+getType()+", ежемесячный платеж по кредиту составляет: "
                +loanPayment+". После уплаты по кредиту баланс зарплатной карточки составит: "+repayCredit());
        System.out.println("Проверка оплаты кредита: "+ сheckingSolvency());
    }
}
