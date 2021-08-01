package P38;

public class Garage<B extends Vehicle> {
    public B vehicle;


    public Garage(B vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle (B vehicle){
        this.vehicle=vehicle;
    }
    @Override
    public String toString(){
        return "Garage{" +  "vehicle=" + vehicle +  '}';

    }
}
