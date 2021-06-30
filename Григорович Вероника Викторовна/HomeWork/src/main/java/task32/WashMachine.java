package task32;

public class WashMachine extends Abstractappliances{
    public WashMachine(String type, int length, int width) {
        super(type, length, width);
    }
    @Override
    public String getType() {
        return "Стиральная машина";
    }

    @Override
    public void getRandomColor() {

    }
}
