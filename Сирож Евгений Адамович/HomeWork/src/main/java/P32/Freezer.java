package P32;
public class Freezer extends Abstractdevices {
public Freezer(int lenght,int height,int width){
    super(lenght,height,width);
}
    @Override
    public String getType() {
        return "Морозилка";
    }
    public int getVolume() {
        return length * width * height;
    }
}



