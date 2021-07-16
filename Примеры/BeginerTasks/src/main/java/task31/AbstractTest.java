package task31;

public abstract class AbstractTest<T> implements Tester {
    private int repeats = 1;

    public AbstractTest(int repeats) {
        this.repeats = repeats;
    }

    @Override
    public void doWork() {
        for (int i = 0; i < repeats; i++) {
            doStep();
        }
        getResult();
    }

    public abstract void doStep();
    public abstract T getResult();
}