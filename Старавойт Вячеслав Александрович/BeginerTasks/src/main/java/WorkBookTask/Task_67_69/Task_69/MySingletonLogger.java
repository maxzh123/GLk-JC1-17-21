package WorkBookTask.Task_67_69.Task_69;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySingletonLogger {

    final static Logger logger = LoggerFactory.getLogger(MySingletonLogger.class); // это и есть Singleton

    public void doSomeStuff(int arg){
        logger.info("Делает какую-то фигню: {}",arg);
        try{int i=arg/0;}
        catch(Exception e){
            logger.error("Фигня не получилась:",e);
        }

    }
    public void dummyWork(String text){
        logger.error(text);
    }
}
