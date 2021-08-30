package Task_32;

public class Printer extends Abstrakt {
       public Printer(String name, int power) {
              super(name, power);
       }

    @Override
    public boolean powerOff() {
        return true;
    }

    @Override
    public boolean powerON() {
        return false;
    }

}


