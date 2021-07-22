package Task32;

import java.util.Scanner;

public class Runner {
    static final private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WashingMachine a1 = new WashingMachine( 24);
        a1.setState(true);
        workWithAppliances(a1);

    }
    private static int readKeyboard(){
        return scanner.nextInt();
    }

    public static void workWithAppliances (Appliances a) {

        while (a.isAlive()) {
            a.printMenu();
            System.out.println("Введите команду");
            int command1=readKeyboard();
            a.printMenu123();
            a.userCommand(command1);
            System.out.println("Введите команду");
            int command2=readKeyboard();
            a.обработка();


    }
        System.out.println("Бытовая техника выключена");
}
}
// переписать нужно и изменить слегка. Так у тебя все работало
