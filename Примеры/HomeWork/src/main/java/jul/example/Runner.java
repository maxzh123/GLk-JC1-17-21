package jul.example;

import jul.example.anotherPackage.Inner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http://logback.qos.ch/manual/configuration.html
 * https://github.com/junit-team/junit5-samples/tree/r5.7.2/junit5-jupiter-starter-maven
* */
public class Runner {

    final static Logger logger = LoggerFactory.getLogger(Runner.class);


    public static void main(String... args){
        Inner i=new Inner();
        logger.info("Мы начали");
        i.doSomeStuff(5);
        i.dummyWork();
        logger.info("Мы кончили");
    }

}
