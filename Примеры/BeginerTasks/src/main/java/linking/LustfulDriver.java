package linking;

public class LustfulDriver extends JustDriver{
    @Override
    public void doWork() {
        System.out.println("Я довезу "+getCargoTitle()+", если по пути нет распутных женщин.");
    }

}
