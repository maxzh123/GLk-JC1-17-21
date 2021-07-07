package WorkBookTask.Task_35;

public class Runner  {
    public static void main(String[] args) {
        // по умолчанию переопределил метод to String в enum  для нормального вывода.
        System.out.println(Seosons.AUTUMN);
        System.out.println(Seosons.WINTER);
        System.out.println(Seosons.SPRING);
        System.out.println(Seosons.SUMMER);
        // так для примера вывел как вывести методы из enum
        System.out.println("______________________________");
        System.out.println(Seosons.WINTER.getDescription());
        System.out.println(Seosons.WINTER.getCountOfDays());
    }
}
