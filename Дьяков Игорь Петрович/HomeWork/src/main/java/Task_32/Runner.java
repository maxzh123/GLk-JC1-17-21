package Task_32;
import java.util.Scanner;
public class Runner{

    static final Scanner scan=new Scanner(System.in);
       public static void main(String[] args){
        Abstrakt scanner=new scanner("сканер",10,"стол");
        Abstrakt printer=new Printer("принтер",44);

        workwithButton(scanner);
        workwithButton(printer);
    }

    private static int readButton() {return scan.nextInt();}

    private static void workwithButton(interfaceHOME action) {
        while (action.powerOff()) {
            if (!action.powerON()) {

                action.printMenu();
                int a = readButton();
                action.userComand(a);
                return;
            }
        }

    }
}


