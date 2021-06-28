package task25;

public class MoneyBox {
    private final int nominal;
    private int count;

    public MoneyBox(int nominal, int count) {
        this.nominal = nominal;
        this.count = count;
    }

    public int getNominal() {
        return nominal;
    }

    public int getCount() {
        return count;
    }

    public boolean getTakeMoney(int num) {
        if (count>=num){
            count-=num;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MoneyBox{" +
                "nominal=" + nominal +
                ", count=" + count +
                '}';
    }
}
