package WorkBookTask.Task_33;

public class DebitCardAlfaBank extends DebitCard {


    public DebitCardAlfaBank(String name, int validityPeriod,String nameBank) {
        super(name, validityPeriod,nameBank);
    }
    @Override
    public void printInfoCard(){
        System.out.println("Дебетовая карта от альфа-банка  дает вам уйму возможностей!!!! ");
        System.out.println("Мы всегда будем рады помочь вам!!!");
    }
}
