package task25;

import java.util.Scanner;

public class Runner {
    static final private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
BBbank bbank=new BBbank();
BPSbank bpSbank=new BPSbank();
bbank.loadMoney(new MoneyBox(5,1));
bpSbank.loadMoney(new MoneyBox(30,1));
workWithAtm(bbank);
workWithAtm(bpSbank);
    }
    private static int readKeyboard(){
        return scanner.nextInt();
    }

    private static void workWithAtm(Cashmashine cm){
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

