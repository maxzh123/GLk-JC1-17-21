package task32;

public class Freezer extends Refrigerator{
    public Freezer(String type, int length, int width, String color, int height) {
        super(type, length, width, color, height);
    }
    @Override
    public String getType() {
        return "морозильник";
    }
    }


