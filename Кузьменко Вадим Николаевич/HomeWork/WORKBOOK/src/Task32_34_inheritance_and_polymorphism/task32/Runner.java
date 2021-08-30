package Task32_34_inheritance_and_polymorphism.task32;

public class Runner {
    public static void main(String[] args) {
        TV tv = new TV ();
        IceBox iceBox = new IceBox();
        LapTop lapTop = new LapTop();
        tv.ShowInfo();
        iceBox.ShowInfo();
        lapTop.ShowInfo();
    }
}
