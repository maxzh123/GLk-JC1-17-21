package Task33;

public abstract class  AbstractCard implements plasticCard{
    protected int money;


    public AbstractCard (int money) {
        this.money = money;
    }

    @Override
    public int allMoneyOnTheCard() {
        return 0;
    }

    @Override
    public boolean payByCard() {
        return false;
    }

    @Override
    public int giveMoney() {
        return 0;
    }

    @Override
    public boolean overdraft() {
        return false;
    }
    @Override
    public String getName () {
        return "Название карточки";
    }
    @Override
    public void showInfo(){
        System.out.println("На карточку только что положили"+money+"; "+"Всего денег"+allMoneyOnTheCard()+" ;"+ "имя карты "+getName());

    }
}
