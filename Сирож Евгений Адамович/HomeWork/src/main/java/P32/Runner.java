package P32;

public class Runner {
    public static void main(String[] args) {
        Abstractdevices[] abstractdevices = new Abstractdevices[]{((new Oven(50, 50, 50))),
                (new Fridge(60, 200, 60)), (new Freezer(60, 100, 60))};
        for (int i = 0; i < abstractdevices.length; i++) {
            abstractdevices[i].printInfo();
            abstractdevices[i].isOn();
            abstractdevices[i].isOff();
            abstractdevices[i].getRandomColor();

            System.out.println(abstractdevices[i].say());
            System.out.println("______________________________________________");
        }
    }
}