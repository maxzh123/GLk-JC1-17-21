package workbook.task32;

public class homeTech {
    public String model;
    public String brand;
    public String color;
    public int volt;
    private boolean on;

    public homeTech (String model, String brand, String Color, int volt, boolean on) {
       this.color = color;
       this.brand = brand;
       this.model = model;
       this.volt = volt;
       this.on = on;



    }
    public void ShowInfo () {
        System.out.println("модель" + " " + model + " ," + "Бренд" + " " + brand + "цвет" + " " + color + " ," + "Напряжение" +
                " ," + "влючен?" + " " + on);
    }
}
