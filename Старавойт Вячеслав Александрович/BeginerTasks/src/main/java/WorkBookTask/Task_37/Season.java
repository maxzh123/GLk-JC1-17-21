package WorkBookTask.Task_37;

public enum Season {
    WINTER(88,"WINTER"),
    SPRING(91,"SPRING"),
    SUMMER(92,"SUMMER"),
    AUTUMN(92,"AUTUMN");

    private int countOfDay;
    private String nameSeason;


    Season(int countOfDay,String nameSeason){
        this.countOfDay =countOfDay;
        this.nameSeason=nameSeason;
    }

    public int getCountOfDay() {
        return countOfDay;
    }

}
