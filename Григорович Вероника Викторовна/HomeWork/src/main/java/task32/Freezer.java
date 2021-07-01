package task32;

public class Freezer extends Refrigerator{
    public Freezer(int length, int width, int height) {
        super(length, width, height);
    }
    @Override
    public String getType() {
        return "Морозильник";
    }


    public String messages(Mistakes code) {
        if(code==Mistakes.DangerOfDefrosting) {
            return phrase="Еррор, я сейчас разморожусь";
        }
        return null;
    }
    public void printInfoAboutMistakes() {
        System.out.println("Внезапное сообщение об ошибке ");
        messages(Mistakes.DangerOfDefrosting);
    }

    }


