package Task37;

public enum Enum {
    Winter ("Winters", 90), Spring("Spring", 92), Summer("Spring", 92), Autumn("Spring", 91);
    private int days;
    private String nameOfTheMonth;

    Enum(String nameOfTheMonth, int days) {
        this.nameOfTheMonth=nameOfTheMonth;
        this.days=days;
    }
    @Override
    public String toString() {
        return  "nameOfTheMonth" + nameOfTheMonth +
                "numberOfDaysInAMonthQuantities=" + days+
                '}';
    }
}
