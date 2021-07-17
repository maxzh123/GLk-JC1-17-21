package task44;

public class DrinkBeer {
    public void getdrink () {
        Age age = new Age();
        try {
            age.setAge(10);
        } catch (AgeException e) {
            System.err.println(e.getMessage());
            System.out.println("YouVeryYoung");
        }
        System.out.println("чрезмерное упортребление алкоголя вредит вашему здоровью!");
    }
}