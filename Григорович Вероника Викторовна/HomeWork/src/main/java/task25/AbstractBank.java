package task25;

public abstract class AbstractBank implements Cashmashine {
    protected MoneyBox[] boxes;
    private boolean machineOn=true;

    public AbstractBank(MoneyBox... boxes) {
        loadMoney(boxes);
    }

    protected void loadMoney(MoneyBox... boxes){
        this.boxes=boxes;
    }

    public AbstractBank() {
        boxes=new MoneyBox[0];
    }

    public String getName(){
        return "какойто банк";
    }



    @Override
    public boolean isAlive() {
        return moneyCount()>0 ;
    }
    public int moneyCount() {
        if(boxes==null) return 0;
        int sum=0;
        for (MoneyBox money : boxes) {
            sum+=money.getCount()*money.getNominal();
        }
        return sum;
    }
    @Override
    public void printMenu() {
        System.out.println("_________________________ "+getName()+" ____________________________________");
        System.out.println("Мы рады приветствовать Вас!");
        System.out.println("Надеемся наш сервис удивит вас.");
        System.out.println("_____________________________________________________________");
        System.out.println();
        System.out.println("  <<< Если хотите ДОБАВИТЬ деньги в банкомат >>>  нажмите: 1");
        System.out.println(" <<< Если хотите СНЯТЬ деньги из банкомата >>>    нажмите: 2");
        System.out.println("              <<< Если вы закончили>>>> нажмите: 3");
    }
    @Override
    public boolean userCommand(int readKeyboard) {
        if(readKeyboard==1 || readKeyboard==2) return false;
        if (readKeyboard==3){
            powerOff();
            return true;
        }
        return userCommand(readKeyboard,0);
    }

    protected  void powerOff() {
    machineOn=false;
}
    protected boolean takeMoney(int moneyCont){
        for (MoneyBox m : boxes) {
            while (moneyCont > 0 && moneyCont > m.getNominal()) {
                if (m.getTakeMoney(1)) {
                    moneyCont -= m.getNominal();
                }
            }

        }
        return moneyCont>0;
    }
    @Override
    public boolean userCommand(int readKeyboard,int moneyCont) {
        if (boxes==null) return false;
        if (readKeyboard==2) {
            takeMoney(moneyCont);
        }
        return true;
    }

}
