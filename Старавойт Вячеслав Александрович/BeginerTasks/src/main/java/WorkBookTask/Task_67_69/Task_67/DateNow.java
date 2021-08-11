package WorkBookTask.Task_67_69.Task_67;

import java.util.Date;

 public  class DateNow {

    private DateNow(){
    }

    private static class SingletonHolder{
        private final static Date date = new Date();
    }
    public static Date getDate(){
        return SingletonHolder.date;
    }
}
