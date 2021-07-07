package task34;

public class Chief extends AbstractPosition { //фиксированный оклад плюс процент от выручки
protected int proceeds; //выручка от его деятельности
    protected int percent;

    public Chief(int salary, int workExperience, int proceeds, int percent) {
        super(salary, workExperience);
        this.proceeds=proceeds;
        this.percent=percent;
    }

    public String getPosition() {
        return "начальник";
    }
    @Override
    public int getSalary() {
        return salary+getSalaryWithBonusOf0TheMonth()+getSalaryWithAccrualsDependingOnLengthOfService()+(percent*proceeds)/100;
    }

    @Override
    public void printInfo() {
        System.out.println(getPosition()+": заработная плата по итогам месяца составляет - "+getSalary());
    }
}

