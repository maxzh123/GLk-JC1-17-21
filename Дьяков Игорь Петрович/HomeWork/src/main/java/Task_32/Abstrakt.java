package Task_32;

public abstract class Abstrakt implements interfaceHOME {

    protected String mesto;
    protected int power;
    protected String name;


    public Abstrakt(String name,int power, String mesto) {
        this.name=name;
        this.power=power;
        this.mesto=mesto;

    }

    public Abstrakt(String name, int damage) {
        this.name=name;
        this.power=damage;
    }
    @Override
    public boolean powerOff() { return false; }

    @Override
    public boolean powerON() { return true; }

    @Override
    public void printMenu(){
       System.out.println("----------------------Перед тобой "+name+"----------------------");
       System.out.println("----------------------Выбери кнопку----------------------");
       System.out.println("(1) запускает "+name+" ----------------------(2) следуем дальше");
    }

    public boolean userComand(int choise){
        if(choise==1){System.out.println("Ты включил =="+name+" мощностью "+power+"Вт "+mesto+"=="+"\n");return powerON();}
        if(choise==2){System.out.println("Окей идем дальше "+name+" выключен"+"\n");return powerOff();}
        else {System.out.println("не жми куда попало, пропуск хода");}
        return true;}


}

