package Tasks67_69Patterns.Task68Syngleton;


import java.time.LocalDate;

public class MySingleton {
//Создайте простейший сервис с методом, который выводит на экран текущую дату. Сделайте его Singleton и используйте в основном теле программы

    private static volatile LocalDate instance;
//сделала getInstance именно так, потому что почитала на хабре, что рекомендуют исполь зовать именно такой подход к реализации шаблона
    //DoubleCheckedLocking &volatile
    public static LocalDate getInstance() {
        LocalDate localInstance=instance;
        if (localInstance==null) {
            synchronized (LocalDate.class) {
                localInstance=instance;
                if(localInstance==null) {
                    instance=localInstance=LocalDate.now();
                }
            }
        }
        return localInstance;
    }
//    public LocalDate getCurrentDate(){
//        return LocalDate.now();
//    }

}
