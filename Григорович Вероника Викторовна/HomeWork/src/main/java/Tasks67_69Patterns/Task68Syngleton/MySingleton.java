package Tasks67_69Patterns.Task68Syngleton;


public class MySingleton {
//Создайте простейший сервис с методом, который выводит на экран текущую дату. Сделайте его Singleton и используйте в основном теле программы

    private static volatile MySingleton instance;
//сделала getInstance именно так, потому что почитала на хабре, что рекомендуют исполь зовать именно такой подход к реализации шаблона
    //DoubleCheckedLocking &volatile
    public static MySingleton getInstance() {
        MySingleton localInstance=instance;
        if (localInstance==null) {
            synchronized (MySingleton.class) {
                localInstance=instance;
                if(localInstance==null) {
                    instance=localInstance=new MySingleton();
                }
            }
        }
        return localInstance;
    }
    public java.util.Date getCurrentDate(){
        return new java.util.Date();
    }

}
