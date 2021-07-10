package Alegrova;

public class Human {
    int age;
    protected Leitenant grade;

    public void Identify(){
        System.out.println("Просто человек разумный.");
    }

    public String DoIt(Entertainment entertainment, Human human){
        if(entertainment instanceof Dance){
            System.out.println("Человек и танцы");
        }
        return "человек";
    }
}
