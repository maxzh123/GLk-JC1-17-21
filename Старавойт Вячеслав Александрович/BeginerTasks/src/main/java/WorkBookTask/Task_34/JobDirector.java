package WorkBookTask.Task_34;

public class JobDirector extends AbstractJobStructure {
    private int increasingTariff = 10;

    public JobDirector(String position, String paymentMethod) {
        super(position, paymentMethod);
    }


    @Override
    public void doSalary() {
        System.out.println("Дорогой согласно вашей должности '" + getPosition() + "' и метода оплаты '" + getPaymentMethod());
        System.out.println("Вам начислено: " + salary * increasingTariff);
    }
}