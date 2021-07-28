package P32;

public class Fridge extends Abstractdevices {
    public Fridge(int lenght,int height,int width){
        super(lenght,height,width);
    }
    @Override
    public String getType() {
        return "Холодос";
    }
    public int getVolume() {
        return length * width * height;
    }



}
