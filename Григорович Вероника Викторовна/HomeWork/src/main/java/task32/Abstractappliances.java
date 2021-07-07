package task32;


import java.util.Random;

public abstract class Abstractappliances implements Appliances{
    Colors[] colors = Colors.values();
    Random random = new Random();
    protected int length;
    protected int width;
    protected String type;
    protected String phrase=null;

    public Abstractappliances(int length, int width) {
        this.length=length;
        this.width=width;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void isOn() {
        System.out.println(getType()+ ": включено в розетку.");
    }

    @Override
    public void isOf() {
        System.out.println(getType()+ ": не включено в розетку.");
    }

    @Override
    public int getArea() {
        return length*width;
    }

    @Override
    public String say() {
        String str=phrase;
        phrase="";
        return str;
    }

    @Override
    public void printInfo() {
        System.out.println(getType()+": " + length +" см длина, "+ width+" см ширина." );
        System.out.println("Занимаемая площадь: " + getArea() + " сантиметров квадратных.");
    }

   @Override
   public String getCodeOfMistakes(CodeOfMistakes code) {
       if (code instanceof Mistakes) {return (messages((Mistakes) code)); }
       return  messages(code);
   }


    public String messages(CodeOfMistakes code) {
        return null;
    }
    public String messages(Mistakes code) {
       switch (code){
           case EndedUPlace:
               phrase="Скорее выньте из меня что нибудь";
            break;
          case DangerOfDefrosting:
               phrase="Еррор, я сейчас разморожусь";
               break;
           case SomethingHasLeaked:
               phrase="У меня что-то протекло, например молоко";
              break;
         case DuvetCoverAteSock:
              phrase="Кажется, пододеяльник съел носок";
          default:
     }
       return null;
    }
     @Override
    public void printInfoAboutMistakes() {

     }




    public void getRandomColor() {
        int index = random.nextInt(colors.length);
        System.out.println("В зависимости от цвета выбранной модели, имееются особенности эксплуатации. Цвет: "+colors[index]);
        switch (index) {
            case 0:
                System.out.println("имеется секретный отдел для винишка");
                break;
            case 1:
                System.out.println("запрещено рисовать на устройстве красные полосы");
                break;
            case 2:
                System.out.println("запрещено рисовать на устройстве белые полосы");
                break;
            case 3:
                System.out.println("защита от детей и домашних животных");
                break;
            case 4:
                System.out.println("без особенностей");
                break;
            default:
        }
    }
}
