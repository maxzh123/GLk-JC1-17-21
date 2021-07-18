package linking;

public class JustDriver implements Driver {

    public String getCargoTitle() {
        return "груз";
    }

    @Override
    public void doWork() {
        System.out.println("Я просто довезу "+getCargoTitle()+"");
    }

    public void processWithStaticProcessor() {
        StaticProcessor.process(this);
    }
    public void processWithProcessor(Processor p) {
        p.process(this);
    }
}
