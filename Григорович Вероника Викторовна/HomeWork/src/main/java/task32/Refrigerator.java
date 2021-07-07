package task32;

import java.util.Random;

public class Refrigerator extends Abstractappliances {
    Colors[] colors = Colors.values();
    Random random = new Random();
    protected int height;

    public Refrigerator(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public String getType() {
        return "Холодильник";
    }

    public int getVolume() {
        return length * width * height;
    }


    @Override
    public void printInfo() {
        System.out.println(getType() + ": " + length + " см длина, " + width + " см ширина, " + height + " см высота.");
        System.out.println("Занимаемая площадь: " + getArea() + " сантиметров квадратных.");
        System.out.println("Занимаемый объем: " + getVolume() + " сантиметров кубических.");
    }

    public String messages(Mistakes code) {
        if(code==Mistakes.SomethingHasLeaked) {
            return phrase="У меня что-то протекло, например молоко";
        }
        return null;
    }
    public void printInfoAboutMistakes() {
        System.out.println("Внезапное сообщение об ошибке ");
        messages(Mistakes.SomethingHasLeaked);
    }
}


