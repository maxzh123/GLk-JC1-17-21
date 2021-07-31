package Task43_45;

public class Person {
  private   String name;
  private   boolean hatIsOn;
  private   boolean shoesAreDressed;
  private   boolean clothesAreOn;

    public Person (String name) {
        this.name=name;
    }
    public void putHat () {
        this.hatIsOn = true;
    }
    public void putShoes () {
        this.shoesAreDressed = true;
    }
    public void putClothes () {
        this.clothesAreOn = true;}

    public void goAut () throws ThePersonIsNotReadyToGoOut{
        if (hatIsOn&shoesAreDressed&clothesAreOn){
            System.out.println( name + ", можно выйти на улицу ");
        } else {
            throw new ThePersonIsNotReadyToGoOut(name + " оденься!!!!! " + "обувь на ногах - " + shoesAreDressed + "; шапка на голове - " + hatIsOn + "; одежда на теле - " + clothesAreOn);
        }
    }

}


