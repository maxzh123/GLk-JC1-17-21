package task38;


public class Garage <T extends Vehicle> {
   public T vehicle;

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
   }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicle +
                '}';
    }
}
