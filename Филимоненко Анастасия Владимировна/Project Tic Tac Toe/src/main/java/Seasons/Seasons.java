package Seasons;

public enum Seasons {
    WINTER("Зима", 90), SPRING("Весна", 92),
    SUMMER("Лето", 92), AUTUMN("Осень", 91), LEAPYEAR("Зима", 91),;
    public String description;
    public int countOfDays;


    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }
}
