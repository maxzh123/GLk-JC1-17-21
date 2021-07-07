package WorkBookTask.Task_33;

public abstract class AbstractCard {
    protected String name;
    protected int validityPeriod;  // поле на срок годности
    protected String nameBank;


    public AbstractCard(String name, int validityPeriod,String nameBank) {
        this.name = name;
        this.validityPeriod = validityPeriod;
        this.nameBank=nameBank;
    }

    public void talkAboutMyself(){
        System.out.println("Вы выбрали следующую карту: '" + this.name + "'. Cо сроком действия: " +this.validityPeriod+ " лет.'" + this.nameBank + "' Название банка карты.");
    }
    public void printInfoPay(){}

    public void printInfoCard(){}
}








//    }
//
//    @Override
//    public void printMenu() {
//        System.out.println("_______________________________________");
//        System.out.println("Вы выбрали следующую карту: '" + this.name + "'. Cо сроком действия: " +this.validityPeriod+ " лет.");
//        System.out.println("Хотите узнать более подробно >>>>> нажми 1");
//        System.out.println("Или вы знаете что вам нужна именно эта карта, сразу выпустить >>>>> нажми 2");
//        System.out.println("Ошиблись с выбором хотите вернуться в главное меню>>> нажми 3");
//        System.out.println("_______________________________________");
//    }
//
//    @Override
//    public void printMenuCards() {
//        System.out.println("_____________________________"+ this.name +"______________________________________");
//        System.out.println(" Тут много всяких достоинстов этой карты какая она клевая и почему выбрирать ее. ");
//        System.out.println(" Если мало достоинств, напишем еще кучу всякой фигни");
//        System.out.println(" Выпустить карту >>>>> нажми 4");
//        System.out.println("Ошиблись с выбором хотите вернуться в главное меню>>> нажми 3");
//        System.out.println("___________________________________________________________________");
//
//    }
//
//    @Override
//    public void printMistake() {
//        System.out.println("___________________________________________________________________");
//        System.out.println(" Ввели что-то непонятное, начнем сначала или заново) ");
//        System.out.println(" /////////Ошибочки друг мой- не всегда приятно!///////");
//        System.out.println("___________________________________________________________________");
//
//    }
//
//    public void printMakingCard(){
//        System.out.println("Ваша карта '" + this.name +"' готова. Можете забрать. " );
//        System.out.println();
//        System.out.println("Спасибо что выбрали нас!!!");
//        System.out.println("Для выхода в главное меню нажмите 3");
//    }
//
//    @Override
//    public boolean userCommand(int cmd) {
//        if ( cmd ==1){ return false;}
//        if ( cmd == 2){return false;}
//        return true;
//    }
//}


