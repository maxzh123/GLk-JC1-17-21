package task32;

public class Runner {

    public static void main(String[] args) {
        WashMachine wash = new WashMachine("стиральная машина", 60, 60);
        wash.printInfo();
        wash.isOn();
        wash.messages(Mistakes.DuvetCoverAteSock);
        System.out.println("У стиральной машины сообщение для вас: " + wash.say());
        System.out.println("______________________________________________");

        Refrigerator refr = new Refrigerator("холодильник", 60, 60, 200);
        refr.printInfo();
        refr.isOn();
        refr.messages(Mistakes.SomethingHasLeaked);
        System.out.println("У холодильника сообщение для вас: " + refr.say());
        refr.getRandomColor();
        System.out.println("______________________________________________");

        Freezer freezer = new Freezer("морозильник", 60, 60, 150);
        freezer.printInfo();
        freezer.messages(Mistakes.DangerOfDefrosting);
        System.out.println("У морозильника сообщение для вас: " + freezer.say());
        freezer.isOf();
    }
}

