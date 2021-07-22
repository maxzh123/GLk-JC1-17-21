package Task33;

public class Card2 extends Card1{
    public Card2(int money, int accomulation) {
        super(money, accomulation);
    }

    @Override
    boolean сredit() {
        return super.сredit();
    }

    @Override
    public boolean overdraft() {
        if (allMoneyOnTheCard()>2000)
            return true;
        return false;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Возможность overdraft - " + overdraft()+"Возможность кредита - "+сredit());
    }

    @Override
    public int allMoneyOnTheCard() {
        return super.allMoneyOnTheCard();
    }

    @Override
    public boolean payByCard() {
        return super.payByCard();
    }

    @Override
    public int giveMoney() {
        return super.giveMoney();
    }

    @Override
    public String getName() {
        return "rainbow";
    }
}
