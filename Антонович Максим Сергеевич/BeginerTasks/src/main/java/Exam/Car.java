package Exam;

public class Car  {
    // private   String name;
    private OwnersName ownersName;
    private   Carmodel carmodel;
    private   int engineCapacity;


    public Car(OwnersName ownersName, Carmodel carmodel, int engineCapacity) {
        this.ownersName = ownersName;
        this.carmodel = carmodel;
        this.engineCapacity = engineCapacity;
    }

    public OwnersName getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(OwnersName ownersName) {
        this.ownersName = ownersName;
    }

    public Carmodel getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(Carmodel carmodel) {
        this.carmodel = carmodel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ownersName=" + ownersName +
                ", carmodel=" + carmodel +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
