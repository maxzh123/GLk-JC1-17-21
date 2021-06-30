package WorkBookTask.Task_34;

public class JobEngineerJunior extends JobEngineer{
    private static double juniorMultiplier=0.6;

    public JobEngineerJunior(String position, String paymentMethod, int hoursPerMonth) {
        super(position, paymentMethod, hoursPerMonth);
    }
    @Override
    public void doSalary() {
        System.out.println("Дорогой согласно вашей должности '" + getPosition() + "' и метода оплаты '" + getPaymentMethod());
        System.out.println("Вам начислено: " + (salary + hoursPerMonth*hoursTariff*juniorMultiplier ));
    }
}

