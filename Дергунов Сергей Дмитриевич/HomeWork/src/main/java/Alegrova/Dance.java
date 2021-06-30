package Alegrova;

public class Dance implements Entertainment {
    boolean active = true;

    public String Entertiment() {
        System.out.println("Танцы, у клубе будут танци!!!");
        return "потанцевать";
    }

    public String getEnt(){
        return "потанцевать ";
    }
}
