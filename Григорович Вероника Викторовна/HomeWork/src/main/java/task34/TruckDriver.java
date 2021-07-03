package task34;

public class TruckDriver extends AbstractDriver{ //смешанная
    protected int carrying; //доплата в зависимости от грузоподъемности
    protected int sumHours; // количество отработанных часов

    public TruckDriver(int salary, int workExperience, int carrying, int sumHours) {
        super(salary, workExperience);
        this.carrying=carrying;
        this.sumHours=sumHours;
    }
    public String getPosition() {
        return "Водитель грузового автомобиля";
    }
    @Override
    public int getCarrying() {
        if (carrying<3) {return 2;}
        else if (3<=workExperience && workExperience<7) {return 3;}
        else if (7<=workExperience && workExperience<10) {return 4;}
        else if (workExperience>=10) {return 5;}
        return 0;
    }

    @Override
    public int getSalaryWithBonusOf0TheMonth() {
        return (getCarrying()*sumHours*bonusOf0TheMonth)/100;
    }

    @Override
    public int getSalaryWithAccrualsDependingOnLengthOfService() {
        return (getCarrying()*sumHours*getAccrualsDependingOnLengthOfService())/100;
    }
    @Override
    public int getSalary() {
        return (getCarrying()*sumHours+getSalaryWithAccrualsDependingOnLengthOfService()+getSalaryWithBonusOf0TheMonth());
    }
    @Override
    public void printInfo() {
        System.out.println(getPosition()+": заработная плата по итогам месяца составляет - "+getSalary());
    }

}
