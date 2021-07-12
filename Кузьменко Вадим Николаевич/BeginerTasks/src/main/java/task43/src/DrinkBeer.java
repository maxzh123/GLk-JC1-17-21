public class DrinkBeer {
    public void getdrink () {
        Age age = new Age ();
        try {
            age.setAge(14);
        } catch (AgeException e) {
            System.err.println(e.getMessage());
            System.out.println("YouVeryYoung");
        }

    }
}
