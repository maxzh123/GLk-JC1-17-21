package task32;

public class Runner {

    public static void main(String[] args) {
        Abstractappliances [] abstractappliances=new Abstractappliances[]{(new WashMachine(60,60)),
        (new Refrigerator(60,60,200)), (new Freezer(60,60,200))};
        for (int i = 0; i < abstractappliances.length; i++) {
            abstractappliances[i].printInfo();
            abstractappliances[i].isOn();
            abstractappliances[i].getRandomColor();
            abstractappliances[i].printInfoAboutMistakes();
            System.out.println(abstractappliances[i].say());
            System.out.println("______________________________________________");
        }
    }
}

