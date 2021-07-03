package task34;

public abstract class AbstractDriver extends AbstractPosition{
    public AbstractDriver(int salary, int workExperience) {
        super(salary, workExperience);
    }
    @Override
    public int getCarrying() {
        return 0;
    }
}

