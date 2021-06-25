package task25;

public class BBbank extends AbstractBank{
    @Override
    public String getName(){
        return "Беларусьбанк";
    }
    @Override
    public boolean userCommand(int readKeyboard) {
        if (readKeyboard==1 ) return false;
        if (readKeyboard==2 ) {
            powerOff();
            return true;
        }
        return userCommand(readKeyboard,0);
    }

    //    @Override
//    public void printMenu() {
//        System.out.println("______________________ БелаРусь банк __________________________");
//        System.out.println("У нас есть бабло для вас:"+moneyCont());
//        System.out.println("_____________________________________________________________");
//        System.out.println(" <<< Если хотите СНЯТЬ деньги из банкомата >>>    нажмите: 1");
//        System.out.println("              <<< Если вы закончили>>>> нажмите: 2");
//
//    }

    @Override
    public boolean userCommand(int readKeyboard,int moneyCont) {
        if (readKeyboard==1) {
            takeMoney(moneyCont);
        }
        return super.userCommand(readKeyboard,moneyCont);
    }
}
