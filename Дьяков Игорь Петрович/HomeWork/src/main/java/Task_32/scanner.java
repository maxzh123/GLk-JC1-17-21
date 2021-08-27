package Task_32;

public class scanner extends Abstrakt {
    public scanner(String name, int power, String mesto ) {
        super(name,power,mesto);
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

