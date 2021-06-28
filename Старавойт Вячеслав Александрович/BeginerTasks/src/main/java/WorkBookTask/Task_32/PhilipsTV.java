package WorkBookTask.Task_32;

public class PhilipsTV extends AbstractTV {

    public PhilipsTV(int screenDiameter, String screenResolution) {
        super(screenDiameter, screenResolution);
    }

    @Override
    public String getName(){
        return "Philips";
    }


    @Override
    public boolean offOn() {
        return true;
    }

    @Override
    public void printMenu(){
        System.out.println("Вас приветствует наш магазин телевизоров!!!");
        System.out.println("Вы выбрали один из лучших телевизоров под брэндом: ");
        System.out.println("--------------"+ getName()+"---------------");
        System.out.println("Мои характеристики следующие: " + screenDiameter + " -дюймов; " + screenResolution + "- разрешение;" );
        System.out.println(" Если вам не трудно, выключи меня <<НАЖМИ>> 2");
    }

    @Override
    public void printOffMenu() {
        System.out.println("<<<Дорогой клиент, телевизор выключен!!!>>>>");
        System.out.println("Хочешь узнать что за он и что он умеет? <<НАЖМИ>> 1");
    }


}
