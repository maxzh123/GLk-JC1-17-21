package WorkBookTask.Task_33;

public class CreditCard extends AbstractCard {
    private String overdraft;

    public CreditCard(String name, int validityPeriod,String nameBank,String overdraft ) {
        super(name, validityPeriod,nameBank);
        this.overdraft=overdraft;
    }

    @Override
    public void printInfoPay() {
        System.out.println("Этой картой можно оплатить все что угодно, даже при отсутствии денег");
    }
   @Override
   public void talkAboutMyself(){
       System.out.println("Вы выбрали следующую карту: '" + this.name + "'. Cо сроком действия: " +this.validityPeriod+ " лет.'" + this.nameBank + "' Название банка карты." + this.overdraft+ " имеется функция");

   }
}
