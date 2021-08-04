package P35;

enum Seasons {
    WINTER("Зима", 89),
    SPRING("Весна", 91),
    SUMMER("Лето", 92),
    AUTUMN("Осень", 92);

    private String description;
    private int countOfDays;

    @Override
    public String toString() {
        return "Время года : " + description + "! Дней в году =  " + countOfDays;
    }

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public String getDescription() {
        return description;
    }


}

