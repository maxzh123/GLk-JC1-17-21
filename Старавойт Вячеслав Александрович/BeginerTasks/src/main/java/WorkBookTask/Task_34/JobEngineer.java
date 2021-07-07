package WorkBookTask.Task_34;

public class JobEngineer extends AbstractJobStructure {
    protected   int hoursPerMonth;   // часовая переменная сколько отработал человек
   protected static int hoursTariff=2 ;

    public JobEngineer(String position, String paymentMethod,int hoursPerMonth ) {
        super(position, paymentMethod);
        this.hoursPerMonth=hoursPerMonth;
    }
    @Override
    public void doSalary() {
        System.out.println("Дорогой согласно вашей должности '" + getPosition() + "' и метода оплаты '" + getPaymentMethod());
        System.out.println("Вам начислено: " + (salary + hoursPerMonth*hoursTariff) );
    }
}
