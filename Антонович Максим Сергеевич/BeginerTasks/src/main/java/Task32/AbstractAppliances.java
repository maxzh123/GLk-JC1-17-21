package Task32;

public abstract class AbstractAppliances implements Appliances {
    protected boolean state = false;
    protected int weight;
    protected int maximumPermissibleWeight;

    public AbstractAppliances ( int maximumPermissibleWeight ){
       // this.weight = weight;
        this.maximumPermissibleWeight = maximumPermissibleWeight;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public boolean isAlive() {
        if (state==true) {
            return true;
        }
        return false;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String printState() {
        if (state==true) {
            return "Бытовая техника включена";
        }
        return "Бытовая техника выключена";
    }

    public String обработка () {
        if (mistakes(25)==true) {
            return "Мы можем";
        }
        return "Стоп";
    }

    @Override
    public boolean mistakes(int readKeyboard) {
        if (weight<maximumPermissibleWeight){
           return true;
        }
      return false;
    }

    @Override
    public void printMenu() {
     System.out.println(".......... " + printState()+ "..........");
        System.out.println("........." + getName() + " ..........");
        System.out.println("..........Приветствую вас............");
        System.out.println(".....................................");
        System.out.println();

    }

    @Override
    public boolean userCommand(int readKeyboard) {
        if (readKeyboard == 1 || readKeyboard == 2 || readKeyboard == 3){
        return false;
        }
        if (readKeyboard == 4) {
            powerOff();
            return true;
        }
        return userCommand(readKeyboard);
    }


    protected void powerOff() {
            state = false;
        }

    public String getName () {
            return "Название бытовой техники";
        }
}
