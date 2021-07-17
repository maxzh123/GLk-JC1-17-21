package linking;

public class StaticProcessor {

    public static void process(Driver d){
        System.out.print("Да это просто интерфейс. нет у него его особенностей, но он говорит:");
        d.doWork();
    }

    public static void process(JustDriver d){
        System.out.print("Обычный водила. норм парень. Говорит:");
        d.doWork();
    }

    public static void process(LustfulDriver d){
        System.out.print("Этому парню не читали сказки про моряков и сирен. говорит:");
        d.doWork();
    }

    public static void process(TrickyDriver d){
        System.out.print("Не осуждайте его, он просто кормит семью.говорит:");
        d.doWork();
    }
    public static void process(AlkoDriver d){
        System.out.print("Новый день - новый повод.говорит:");
        d.doWork();
    }
}
