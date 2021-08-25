package Exception.task45;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Task45 {
    private static final Logger log = LogManager.getLogger(Task45.class.getName());

    public static void main(String[] args) throws Exception{
log.info("Программа стартовала");
        Cat cat = new Cat();
        try {
            cat.eat(new Food("мясо"));
           cat.eat(null);
        } catch (NullPointerException e) {
                log.error("Кто то передал null");}
        log.info("Программа закончена");
    }
}
