package task35_37;

public enum Seasons {

    WINTERLEAPYEAR("Зима", 91), WINTER("Зима", 90), SPRING("Весна", 92),
    SUMMER("Лето", 92), AUTUMN("Осень", 91);
    public String description;
    public int countOfDays;


    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }



}
