package jul.example.anotherPackage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inner {
    final static Logger logger = LoggerFactory.getLogger(Inner.class);
    public void doSomeStuff(int arg){
        logger.info("Делает какую-то фигню: {}",arg);
        try{int i=arg/0;}
        catch(Exception e){
            logger.error("Фигня не получилась:",e);
        }

    }
    public void dummyWork(){
        logger.debug("Дурная работа");
    }

    public int someLittleCalculation(int a,int b){
        logger.debug("пример для того, чтобы показать юнит тесты");
        return a+b;
    }

}
