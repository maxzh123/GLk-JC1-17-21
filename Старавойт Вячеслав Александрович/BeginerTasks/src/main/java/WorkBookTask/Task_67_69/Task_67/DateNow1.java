package WorkBookTask.Task_67_69.Task_67;


import java.time.LocalTime;
// Согласно советам нужно использовать неленивую инициализацию везде где можно
//Static field
public class DateNow1 {
        public static final LocalTime INSTANCE = LocalTime.now();
        private DateNow1() {
        }

    }


