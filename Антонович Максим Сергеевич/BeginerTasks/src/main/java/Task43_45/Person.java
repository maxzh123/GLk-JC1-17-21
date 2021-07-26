package Task43_45;

public class Person {
    String name;
    boolean hatIsOn;
    boolean shoesAreDressed;
    boolean clothesAreOn;
    public Person (String name) {
        this.name=name;
    }
    public void putHat () {
        System.out.println("Yes");
        this.hatIsOn = true;
    }
    public void putShoes () {
        System.out.println("Yes");
        this.shoesAreDressed = true;
    }
    public void putClothes () {
        System.out.println("Yes");
        this.clothesAreOn = true;}

    public void goAut () throws ThePersonIsNotReadyToGoOut{
        if (hatIsOn&shoesAreDressed&clothesAreOn){
            System.out.println( name + ", можно выйти на улицу ");
        } else {
            throw new ThePersonIsNotReadyToGoOut(name + " оденься!!!!! ");
        }
    }
}


