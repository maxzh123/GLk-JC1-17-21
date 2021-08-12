package Task4445;

public class Messi {
    private String name;

    public Messi(String name) {
        this.name = name;
    }

    public void shoot(boolean shoot) throws Goal {
        if (shoot) {
            System.out.println(name + " забил!!! ");
        } else {
            throw new Goal(name + " промах ");
        }
    }
}
