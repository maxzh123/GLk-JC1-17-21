package task34;

public interface Payroll {
    int getSalary();
    int getAccrualsDependingOnLengthOfService(); //начисления в зависимости от выслуги лет
    int getSalaryWithBonusOf0TheMonth(); // оклад плюс  премия
    int getSalaryWithAccrualsDependingOnLengthOfService();//оклад плюс выслуга лет
    void printInfo();
    int getCarrying();

}
