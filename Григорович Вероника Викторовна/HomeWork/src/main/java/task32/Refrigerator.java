package task32;

public class Refrigerator extends Abstractappliances{
    protected String color;
    protected int height;

    public Refrigerator(String type, int length, int width, String color, int height) {
        super(type, length, width);
        this.color=color;
        this.height=height;
        }
    @Override
    public String getType() {
        return "холодильник";
    }

    public int getVolume() {
        return length*width*height;
    }
    public String getColor() {
        return this.color;
    }
    }

