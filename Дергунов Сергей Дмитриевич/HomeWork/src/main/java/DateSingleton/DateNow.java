package DateSingleton;

import java.time.LocalDate;

public class DateNow {

    private static volatile DateNow instance;
    private DateNow() {}

    public LocalDate getCurrentDate(){
        return LocalDate.now();
    }

}


