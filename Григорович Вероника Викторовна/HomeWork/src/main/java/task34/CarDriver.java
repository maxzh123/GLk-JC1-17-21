package task34;

public class CarDriver extends AbstractDriver{ //повременная оплата труда
    public CarDriver(int salary, int workExperience) {
        super(salary, workExperience);
    }
    public String getPosition() {
        return "Водитель легкового автомобиля";
    }
    @Override
    public int getSalary() {
        return salary+getSalaryWithBonusOf0TheMonth()+getSalaryWithAccrualsDependingOnLengthOfService();
    }
    @Override
    public void printInfo() {
        System.out.println(getPosition()+": заработная плата по итогам месяца составляет - "+getSalary());
    }
}

