package WorkBookTask.Task_33;

import WorkBookTask.Task_32.TV;

import java.util.Scanner;

public class Runner {

static final Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
      InformationBankCard informationBankCard = new InformationBankCard(10,"Моментальный выпуск карты");

      workWithInformationBoard(informationBankCard);

    }

    private static int readKeyboard() {
        return scanner.nextInt();
    }

    private static void workWithInformationBoard(InformationBoard ib){ // информационное табло через которое пользователь будет все узнавать
    while(!ib.isAlive()){  // пока табло живет >>> будет работать
        ib.printMenu();
        int cmd = readKeyboard();
          if(!ib.userCommand(cmd)){
            ib.printMenuCards();
        }
          else{
              ib.printMistake();
          }

    }

    }
}
