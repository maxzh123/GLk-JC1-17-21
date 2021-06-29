package WorkBookTask.Task_33;

import javax.sound.midi.Soundbank;

public class InformationBankCard implements InformationBoard {
    protected boolean off = false;
    protected int countOfCardsVarieties; // поле для количество разновидностей карт у нашего информационого борда с банковскими картами
    protected String InstantCardIssue; // наш информационный борд имеет возможность выпуска карты

    public InformationBankCard(int countOfCardsVarieties,String InstantCardIssue ){
        this.countOfCardsVarieties=countOfCardsVarieties;
        this.InstantCardIssue =InstantCardIssue;
    }

    @Override
    public boolean isAlive() {
        return off;
    }

    @Override
    public void printMenu() {
        System.out.println("____________________________________________________________________________________________________________________");
        System.out.println("Рады приветствовать Вас, надеемся наше информационное табло поможет вам, определится с выбором  банковской карты!");
        System.out.println();
        System.out.println("Хотите больше узнать о наших предложениях: >>>>>>>>>> ЖМИ '1' ");
        System.out.println("_____________________________________________________________________________________________________________________");


    }

    @Override
    public void printMenuCards() {
        System.out.println();
        System.out.println("Мы можем предложить следующие виды карт:  " +
                "дебетовые, кредитные, овердрафтные");

    }

    @Override
    public void printMistake() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Ввели что-то непонятное, начнем сначала или заново) ");
        System.out.println();
        System.out.println("___________________________________________________________________");
    }

    @Override
    public boolean userCommand(int cmd) {
        if (cmd ==1){
            return false;
        }
        return true;
    }
}
