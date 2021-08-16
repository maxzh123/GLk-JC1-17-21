package Tasks67_69Patterns.Task68Syngleton;


import java.time.LocalDate;

public class MySingleton {
//Создайте простейший сервис с методом, который выводит на экран текущую дату. Сделайте его Singleton и используйте в основном теле программы

    private static volatile MySingleton instance;
    private MySingleton() {}
//сделала getInstance именно так, потому что почитала на хабре, что рекомендуют исполь зовать именно такой подход к реализации шаблона
    //DoubleCheckedLocking &volatile
    public static MySingleton getInstance() {
        if (instance==null) {
            System.out.println("Привет");
            synchronized (MySingleton.class) {
                if(instance==null) {
                    instance= new MySingleton();
                    System.out.println("ура");
                }
            }
        }
        return instance;
    }
    public LocalDate getCurrentDate(){
        return LocalDate.now();
    }

}
