package Tasks;

public class CashCard {
    private String lastName;
    private int pinCode;
    private int balance;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int takeMoney(int money) throws NotEnoughMoneyException {
        if (money > balance)
            throw new NotEnoughMoneyException();

        balance -= money;
        return money;
    }

    public int putMoney(int money) {
        balance += money;
        return money;
    }

    public CashCard(String lastName, int pinCode, int balance) {
        this.lastName = lastName;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public CashCard(String lastName, int pinCode) {
        this(lastName, pinCode, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass())
            return false;
        if (o == this)
            return true;
        CashCard that = (CashCard) o;
        return this.lastName.equals(that.lastName) && this.pinCode == that.pinCode;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int prime = 31;

        result = result * prime + lastName.hashCode();
        result = result * prime + pinCode;

        return result;
    }
}
