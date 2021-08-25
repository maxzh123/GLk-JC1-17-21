package Task_32;
import java.util.Scanner;
public class Runner {
    static final Scanner scan=new Scanner(System.in);

    public static void main(String[] args){
        Abstrakt scanner=new scanner(500,30);
        Abstrakt printer=new Printer(100,20);

        workwithButton(scanner);
        workwithButton(printer);

    }

    private static int readButton(){return scan.nextInt();}
    private static void workwithButton(interfaceHOME action) {
        while (action.energy()) {
            if (action.powerON()) {

                int a = readButton();
                if (action.userComand(a)) {

                }
            }
        }
    }
}
