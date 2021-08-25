package Task_32;

public abstract class Abstrakt implements interfaceHOME {
       public Abstrakt(int power, int damage) {
    }

   @Override  public boolean powerON() {
              return true;}

   @Override  public void printMenu(){
       System.out.println("Ты зашел не в ту хату и запустил механизм смерти выбери кнопку");
       System.out.println("кнопка N-1     |||      N-2 кнопка");
    }

    public boolean userComand(int choise){
        if(choise==1){System.out.println("ты сжег сканнер");return true;}
        if(choise==2){System.out.println("ты сжег принтер");return true;}
        if(choise==3){System.out.println("Ты пришел и исправил подключение приборов с 380 на 220, ты спас вселенную");return true;}
        else {System.out.println("Ты застрял в муках выбора");}
        return false;}

    @Override public void TheEndMenu(){ System.out.println("");}
}

