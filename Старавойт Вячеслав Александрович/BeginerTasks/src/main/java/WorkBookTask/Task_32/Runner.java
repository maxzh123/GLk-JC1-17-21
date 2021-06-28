package WorkBookTask.Task_32;

import java.util.Scanner;

public class Runner {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractTV samsung = new SamsungTV(65, "Ultra HD", "Smart TV");
        AbstractTV philips = new PhilipsTV(48, "HD");

        workWithRemoteControl(samsung);
        workWithRemoteControl(philips);
        philips.offOn();

    }

    private static int readKeyboard() {
        return scanner.nextInt();
    }
//В целом идея верная
    private static void workWithRemoteControl(TV tv) {
        while (tv.isAlive()) {


            if (!tv.offOn()) {     //если телевизор выключен
                tv.printOffMenu();
                int cmd1 = readKeyboard();   // первый раз запросили
                if (!tv.userCommand(cmd1)) {
                    tv.printMenu();
                    int cmd2 = readKeyboard(); // второй раз запросили выключить
                    if (tv.userCommand(cmd2)) {
                        return;
                    }
                }
            } else {
                    tv.printMenu();
                    int cmd2 = readKeyboard(); // второй раз запросили выключить
                    if (tv.userCommand(cmd2)) {
                        tv.printOffMenu();
                        return;


                    }
                }
            }
        }
    }




