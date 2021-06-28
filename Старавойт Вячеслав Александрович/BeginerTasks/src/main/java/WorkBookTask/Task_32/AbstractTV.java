package WorkBookTask.Task_32;

public abstract class AbstractTV implements TV {

    protected int screenDiameter;
    protected String screenResolution;
    protected String smartTv;
    private boolean tvOn=true;


    public AbstractTV(int screenDiameter,String screenResolution,String smartTv){
        this.screenDiameter=screenDiameter;
        this.screenResolution=screenResolution;
        this.smartTv=smartTv;
    }

    public AbstractTV(int screenDiameter,String screenResolution){
        this.screenDiameter=screenDiameter;
        this.screenResolution=screenResolution;
    }



    public String getName(){
        return "Какой-то безымянный телик, этикетка стерлась";
    }

    //TODO попробуй tvOn=!tvOn;
    @Override
    public boolean offOn(){
        return  tvOn=false;
    }

    //TODO Я там понаписывал, а оно уже как надо оказывается.
    @Override
    public boolean isAlive() {
        return tvOn;
    }

    @Override
    public void printMenu() {
        //Какой такой магазин? Цеж телевизер.
        System.out.println("Вас приветствует наш магазин телевизоров!!!");
        System.out.println("Вы выбрали один из лучших телевизоров под брэндом: ");
        System.out.println("--------------"+ getName()+"---------------");
        System.out.println("Мои характеристики следующие: " + screenDiameter + " дюймов; " + screenResolution + " разрешение; " + smartTv+ " есть." );
        System.out.println(" Если вам не трудно, выключи меня <<НАЖМИ>> 2");
    }

    @Override
    public void printOffMenu() {
        System.out.println("<<<Дорогой клиент, телевизор выключен!!!>>>>");
        System.out.println("Хочешь узнать что за он и что он умеет? <<НАЖМИ>> 1");
    }

    @Override
    public boolean userCommand(int cmd) {
        if (cmd==1 ) return false;
        if (cmd==2) {
            offOn();
            return true; // прерываем цикл для printMenu
        }
        return true;
    }
}



