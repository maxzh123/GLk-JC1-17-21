package WorkBookTask.Task_67_69.Task_67;

import java.util.Date;
//Это самый эпичный фэйл. потокобезопасная реализация синглтона и туда пихается не потокобезопасный обьект ))))
//https://javastudy.ru/interview/jee-spring-questions-answers/
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
