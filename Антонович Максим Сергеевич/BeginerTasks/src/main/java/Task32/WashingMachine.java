package Task32;

public class WashingMachine extends AbstractAppliances{


    public WashingMachine(int maximumPermissibleWeight) {
        super( maximumPermissibleWeight);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }


    @Override
    public String getName() {
        return ("Samsung");
    }

    @Override
    public boolean isState() {
        return super.isState();
    }

    @Override
    public void setState(boolean state) {
        super.setState(state);
    }

    @Override
    public void printMenu() {
        super.printMenu();
        System.out.println(" <<< джинсы>>>     нажмите: 1");
        System.out.println(" <<< рубашка>>>    нажмите: 2");
        System.out.println(" <<< все вместе >>>    нажмите: 3");
        System.out.println( "<<< Если вы закончили>>>>                нажмите: 4");
    }

    @Override
    public void printMenu123() {

    }
}
