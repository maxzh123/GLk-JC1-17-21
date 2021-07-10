package task34;

public class Engineer extends AbstractPosition{ //повременная оплата труда

    public Engineer(int salary, int workExperience) {
        super(salary, workExperience);
    }
    public String getPosition() {
        return "инженер";
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
