package DateSingleton;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("dateNow")
public class DateNow {

    private DateNow() {}

    public LocalDate getCurrentDate(){
        return LocalDate.now();
    }

}


