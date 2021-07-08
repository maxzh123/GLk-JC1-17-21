package WorkBookTask.Task_38;

// согласно условия  нужен класс дженерик который может хранить только объекты наследуемые от Vehicle

public class Garage<Object extends Vehicle> {

    public static void main(String[] args) {
    Vehicle car=new Car("Volkswagen");
    Vehicle moto = new Motorcycle("Suzuki GSX-1000");
    Slava slava =new Slava("Слава");
        System.out.println(car);
        System.out.println(moto);
        System.out.println(slava);

    }
}
