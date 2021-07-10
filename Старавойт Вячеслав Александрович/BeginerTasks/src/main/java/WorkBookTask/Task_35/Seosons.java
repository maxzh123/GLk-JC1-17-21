package WorkBookTask.Task_35;

public enum Seosons {
    WINTER("Зима очень холодно",89),
    SPRING("Весна клевое время",91),
    SUMMER("Лето самое клевое время",92),
    AUTUMN("Осень у меня там ДР",92);

    private String description;
    private int countOfDays;

    Seosons(String description, int countOfDays) {
        this.description=description;
        this.countOfDays=countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Время года : "+description+"! Дней в этой поре года :  " + countOfDays;
    }
}
