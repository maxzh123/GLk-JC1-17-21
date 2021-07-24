package Task34;

import Task32.AbstractAppliances;

public abstract class AbstractWorker implements Worker{
    private int money;
    private String name;

    public AbstractWorker (int money, String name) {
        this.money=money;
        this.name=name;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя"+name+"Salary"+salary());
    }

    @Override
    public int salary() {
        return money;
    }
}
