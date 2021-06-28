package task32;

import java.util.Random;

public class Refrigerator extends Abstractappliances {
    Colors[] colors = Colors.values();
    Random random = new Random();
    protected int height;

    public Refrigerator(String type, int length, int width, int height) {
        super(type, length, width);
        this.height = height;
    }

    @Override
    public String getType() {
        return "холодильник";
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

    @Override
    public void getRandomColor() {
        int index = random.nextInt(colors.length);
        System.out.println("В зависимости от цвета выбранной модели, имееются особенности эксплуатации. Цвет: "+colors[index]);
        switch (index) {
            case 0:
                System.out.println("дополнительный лоток для винишка");
                break;
            case 1:
                System.out.println("запрещено рисовать на холодильнике красные полосы");
                break;
            case 2:
                System.out.println("запрещено рисовать на холодильнике белые полосы");
                break;
            case 3:
                System.out.println("защита от детей и домашних животных");
                break;
            case 4:
                System.out.println("без особенносте1");
                break;
            default:
        }
    }
}


