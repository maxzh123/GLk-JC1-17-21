package WorkBookTask.Task_32;

public class SamsungTV  extends AbstractTV{

    public SamsungTV(int screenDiameter, String screenResolution, String smartTv) {
        super(screenDiameter, screenResolution, smartTv);
    }

    @Override
    public String getName(){
        return "Samsung";
    }
}
