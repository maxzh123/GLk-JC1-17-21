package task32;

public class WashMachine extends Abstractappliances {
    public WashMachine(int length, int width) {
        super(length, width);
    }

    @Override
    public String getType() {
        return "Стиральная машина";
    }

    @Override
    public String messages(Mistakes code) {
        if(code==Mistakes.DuvetCoverAteSock) {
            return phrase="Кажется, пододеяльник съел носок";
        }
        return null;
    }
    public void printInfoAboutMistakes() {
        System.out.println("Внезапное сообщение об ошибке ");
        messages(Mistakes.DuvetCoverAteSock);

    }

}


