package task25;

import java.util.Scanner;

public class Runner {
    static final private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
//        String answer = scanner.nextLine();
        BelarusBank bb=new BelarusBank();
        BelAgroProm ag=new BelAgroProm();
        BelarusBank bb2=new BelarusBank();
        bb.loadMoney(new MoneyBox(5,20),new MoneyBox(10,10));
        ag.loadMoney(new MoneyBox(5,20),new MoneyBox(5,5));

        workWithCacheMachne(ag);

        workWithCacheMachne(bb2);

        workWithCacheMachne(bb);


    }
    private static int readKeyboard(){
        return scanner.nextInt();
    }

    private static void workWithCacheMachne(CacheMachine cm){
        while(cm.isAlive()){
            cm.printMenu();
            int cmd=readKeyboard();
            if (!cm.userCommand(cmd)){
                System.out.print("Введите сумму:");
                int money=readKeyboard();
                if (!cm.userCommand(cmd,money)){
                    System.out.print("Шэф усе прапала!");
                }
            }
        }
    }

}
