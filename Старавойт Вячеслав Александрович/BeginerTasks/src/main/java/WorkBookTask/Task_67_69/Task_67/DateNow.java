package WorkBookTask.Task_67_69.Task_67;

import java.time.LocalDate;
//реализация Double Checked Locking & volatile
//+ Ленивая инициализация
//+ Высокая производительность
 public  class DateNow {
     private static volatile LocalDate inst;

    private DateNow() {
    }

  public  static LocalDate getInst() {
        LocalDate localDate = inst;
        if (localDate == null) {
            synchronized (LocalDate.class) {
                localDate = inst;
                if (localDate == null) {
                    inst = localDate =LocalDate.now();
                }
            }

        }
        return localDate;
    }

}
