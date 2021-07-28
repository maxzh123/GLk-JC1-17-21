package P32;

import java.util.Random;

public abstract class Abstractdevices implements Devices {
    Colors[] colors = Colors.values();
    Random random = new Random();
    protected int length;
    protected int width;
    protected int height;
    protected String type;
    protected String phrase = null;

    public Abstractdevices(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void isOn() {
        System.out.println(getType() + ": включено .");
    }

    @Override
    public void isOff() {
        System.out.println(getType() + ": не включено .");
    }

    @Override
    public int getArea() {
        return length * width;
    }
    @Override
    public int getVolume(){
        return length * width * height;
    }

    @Override
    public String say() {
        String str = phrase;
        phrase = "";
        return str;
    }

    @Override
    public void printInfo() {
        System.out.println(getType() + ": " + length + " см длина, " + width + " см ширина," +height+ " см высота.");
        System.out.println("Площадь: " + getArea() + " сантиметров квадратных.");
        System.out.println("Объём: " + getVolume() + " сантиметров кубических.");
    }

    public void getRandomColor() {
        int index = random.nextInt(colors.length);
        System.out.println("В зависимости от цвета выбранной модели, имееются особенности эксплуатации. Цвет: " + colors[index]);
        switch (index) {
            case 0:
                System.out.println("стильный и красивый");
                break;
            case 1:
                System.out.println("был бы савок, если б не мониторчик на двери");
                break;
            case 2:
                System.out.println("теперь вся техника должна быть красной,я всё сказала");
                break;

            default:
        }

    }

}