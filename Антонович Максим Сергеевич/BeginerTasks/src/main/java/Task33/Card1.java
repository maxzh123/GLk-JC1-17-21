package Task33;

public class Card1 extends AbstractCard{

    private int allMoney;
    private int  accomulation;

    boolean сredit () {
        if (allMoney>0)
            return true;
        return false;
    }

    public Card1(int money, int accomulation) {
        super(money);
        this.accomulation=accomulation;
    }

    @Override
    public int allMoneyOnTheCard() {
        allMoney=accomulation+money;
        return allMoney;
    }

    @Override
    public boolean payByCard() {
        if (allMoney>0) {
            return true;
        }
        return false;
    }

    @Override
    public int giveMoney() {
        accomulation = allMoney/2;
        return accomulation;
    }

    @Override
    public String getName() {
        return ("Snow");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Есть возможность купить что-нибудь - " + payByCard()+ " Отложить деньги на квартиру - "+giveMoney());
    }
}
