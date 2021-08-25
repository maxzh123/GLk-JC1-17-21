package Task37.src;

public enum Season {
    WINTER(90,"WINTER"),
    SPRING(91,"SPRING"),
    SUMMER(93,"SUMMER"),
    AUTUMN(94,"AUTUMN");

    private int DAY;
    private String SEASON;


    Season(int DAY,String SEASON){
        this.DAY =DAY;
        this.SEASON=SEASON;
    }

    public int DAY() {
        return DAY;
    }

}