package task25;

public interface Cashmashine {
    boolean isAlive();
    void printMenu();
    boolean userCommand(int readKeyboard);
    boolean userCommand(int readKeyboard,int moneyCont);

}
