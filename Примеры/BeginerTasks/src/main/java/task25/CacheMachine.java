package task25;

public interface CacheMachine {
    boolean isAlive();

    void printMenu();

    boolean userCommand(int readKeyboard);
    boolean userCommand(int readKeyboard,int moneyCont);
}
