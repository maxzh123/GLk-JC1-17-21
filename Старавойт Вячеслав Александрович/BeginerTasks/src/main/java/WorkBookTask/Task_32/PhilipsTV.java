package WorkBookTask.Task_32;

public class PhilipsTV extends AbstractTV {

    public PhilipsTV(int screenDiameter, String screenResolution) {
        super(screenDiameter, screenResolution);
    }

    @Override
    public String getName(){
        return "Philips";
    }

    @Override
     public boolean offOn(){
        return false;
    } // пришлось переопределить метод чтобы телевизор филипс всегда работал,
}
