package DateSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DateNow firstDate = context.getBean("myDate", DateNow.class);
        DateNow secondDate = context.getBean("myDate", DateNow.class);
        System.out.println("Первая дата: " + firstDate.getCurrentDate());
        System.out.println("Вторая дата: " + secondDate.getCurrentDate());
        System.out.println("Но равны ли объекты ДАТА?");
        System.out.println("----------------------");
        System.out.println(firstDate==secondDate);
        System.out.println("----------------------");
        System.out.println(firstDate);
        System.out.println(secondDate);
        context.close();
    }
}
