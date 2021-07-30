package P32;

public class Oven extends Abstractdevices{
    public Oven(int lenght,int height,int width){
        super(lenght,height,width);
    }
    @Override
    public String getType() {
        return "Духовка";
    }
}
