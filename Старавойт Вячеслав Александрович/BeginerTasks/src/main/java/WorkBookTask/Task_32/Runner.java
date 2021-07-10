package WorkBookTask.Task_32;

import java.util.Scanner;

public class Runner {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractTV samsung = new SamsungTV(65, "Ultra HD", "Smart TV");
        AbstractTV philips = new PhilipsTV(48, "HD");

        workWithRemoteControl(samsung); // самсунг придется включать пользователю
        workWithRemoteControl(philips);
        philips.offOn(); // метод который включает телевизор, потому как они с завода включены))))

    }

    private static int readKeyboard() {
        return scanner.nextInt();
    }
//В целом идея верная
    private static void workWithRemoteControl(TV tv) {
        while (tv.isAlive()) {

            if (tv.offOn()) {     //если телевизор выключен
                tv.printOffMenu();
                int cmd1 = readKeyboard();   // первый раз запросили
                if (!tv.userCommand(cmd1)) {
                    tv.printMenu();
                    int cmd2 = readKeyboard();
                    if (tv.userCommand(cmd2)) {
                        return;
                    }
                }
            } else {
                    tv.printMenu();
                    int cmd2 = readKeyboard();
                    if (tv.userCommand(cmd2)) {
                        tv.printOffMenu();
                        return;


                    }
                }
            }
        }
    }




