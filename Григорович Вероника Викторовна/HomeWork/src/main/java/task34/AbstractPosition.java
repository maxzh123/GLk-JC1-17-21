package task34;

public abstract class AbstractPosition implements Payroll {
    protected String position;
    protected static int bonusOf0TheMonth=20; //премия месяца всегда постоянная 20 проц
    protected int salary; //оклад у всех разный
    protected int workExperience; // стаж работы на предприятии

    public AbstractPosition(int salary, int workExperience) {
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public int getAccrualsDependingOnLengthOfService() {
        if (workExperience<1) {return 0;}
        else if (1<=workExperience && workExperience<5) {return 5;}
        else if (5<=workExperience && workExperience<10) {return 10;}
        else if (workExperience>=10) {return 15;}
        return 0;

    }

    @Override
    public int getSalaryWithBonusOf0TheMonth() {
        return (salary*bonusOf0TheMonth)/100;
    }

    @Override
    public int getSalaryWithAccrualsDependingOnLengthOfService() {
        return (salary*getAccrualsDependingOnLengthOfService())/100;
    }

    @Override
    public void printInfo() {

    }
    @Override
    public int getCarrying() {
        return 0;
    }


}
