package WorkBookTask.Task_36;

public enum Season {
    WINTER(1), SPRING(2), SUMMER(3),AUTUMN(4);

    private int id;

    Season(int id){
       this.id =id;
    }

    public int getId() {
        return id;
    }


}
