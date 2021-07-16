package linking;

public class AlkoDriver extends JustDriver{
    @Override
    public void doWork() {
        System.out.println("Я довезу "+getCargoTitle()+",если по пути нет алкомаркета.");
    }
}
