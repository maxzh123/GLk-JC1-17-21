package linking;

import java.util.ArrayList;

public class Runner {
    private static ArrayList<Driver> list=new ArrayList<Driver>();
    private static Processor p=new Processor();

    public static void main(String[] args) {
        //Делаем коллекцию водителей
        list.add(new JustDriver());
        list.add(new AlkoDriver());
        list.add(new JustDriver());
        list.add(new LustfulDriver());
        list.add(new TrickyDriver());
        printSeparator();
        testPoly();
        printSeparator();
        testStaticLinking();
        printSeparator();
        testDynamicLinking();
        printSeparator();
        //При этом более специфичный тип доступен на этапе компиляции, то ранее перегрузка обеспечивает совсем другой выбор:
        StaticProcessor.process(new JustDriver());
        StaticProcessor.process(new AlkoDriver());
        StaticProcessor.process(new JustDriver());
        StaticProcessor.process(new LustfulDriver());
        StaticProcessor.process(new TrickyDriver());
        printSeparator();
        p.process(new JustDriver());
        p.process(new AlkoDriver());
        p.process(new JustDriver());
        p.process(new LustfulDriver());
        p.process(new TrickyDriver());

    }
    private static void printSeparator(){
        System.out.println("----------------------------------------------------------------------------------------------");
    }
    private static void testPoly(){
        /*Иллюстрация полиморфизма. обратите внимание, что для TrickyDriver метод getCargoTitle берется переопределенный,
         хотя и вызывается из функции определенной JustDriver. Это возможно благодаря позднему связыванию.
         В тоже время хотя все типизированные по Driver Вызываются ближайшие реализации.
         Поменяйте тип коллекции с Driver на JustDriver и тип переменной в цикле - убедитесь, что ничего не изменится.
         Во время выполнения жава все равно будет находить наиболее специфичную реализацию.
         */
        for (Driver d:list) {
            d.doWork();
        }
    }
    private static void testStaticLinking(){
        for (Driver d:list) {
            StaticProcessor.process(d);
        }
    }
    private static void testDynamicLinking(){
        for (Driver d:list) {
            p.process(d);
        }
    }


}
