package task32;

public class Runner {

    public static void main(String[] args) {
        WashMachine wash=new WashMachine("стиральная машина", 60, 60);
       infoAboutWashMashine(wash);
        System.out.println("______________________________________________");
       Refrigerator refr=new Refrigerator("холодильник", 60,60,"белый", 200);
       infoAboutRefrigerator(refr);
       checkingForWhite(refr);
        System.out.println("______________________________________________");
        Freezer freezer=new Freezer("морозильник", 60, 60, "красный", 150);
        infoAboutFreezer(freezer);


    }

    public static void infoAboutWashMashine(WashMachine wash) {
        System.out.println("Вас приветствует " + wash.getType() + ", размерами " + wash.length + " см длина, " +
                wash.width + " см ширина.");
        System.out.println("Её площадь составляет " + wash.getArea() + " сантиметров квадратных");
        wash.messages(Mistakes.DuvetCoverAteSock);
        System.out.println("У стиральной машины сообщение для вас: "+wash.say());
        wash.isOn(); //включили лампочку
    }
    public static void infoAboutRefrigerator(Refrigerator refr) {
        System.out.println("Вас приветствует " + refr.getType() + ", размерами " + refr.length + " см длина, " +
                refr.width + " см ширина, "+ refr.height+ " см высота");
        System.out.println("Его площадь составляет " + refr.getArea() + " сантиметров квадратных. Объем - "+refr.getVolume()+
                " сантиметров кубических.");
        refr.messages(Mistakes.SomethingHasLeaked);
        System.out.println("У холодильника сообщение для вас: "+refr.say());
        refr.isOn();
        }


    public static void checkingForWhite(Refrigerator refr) {
        if(refr.getColor().equalsIgnoreCase("белый")) {
            System.out.println("Давай покрасим холодильник в черный цвет");
        }
    }

    public static void infoAboutFreezer(Freezer freezer) {
        System.out.println("Вас приветствует " + freezer.getType() + ", размерами " + freezer.length + " см длина, " +
                freezer.width + " см ширина, "+ freezer.height+ " см высота");
        System.out.println("Его площадь составляет " + freezer.getArea() + " сантиметров квадратных. Объем - "+freezer.getVolume()+
                " сантиметров кубических.");
        freezer.messages(Mistakes.DangerOfDefrosting);
        System.out.println("У холодильника сообщение для вас: "+freezer.say());
        freezer.isOf();
    }


}
