package task32;

public class Freezer extends Refrigerator{
    public Freezer(String type, int length, int width, int height) {
        super(type, length, width, height);
    }
    @Override
    public String getType() {
        return "морозильник";
    }

    }


