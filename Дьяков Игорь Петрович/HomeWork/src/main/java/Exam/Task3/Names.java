package Exam.Task3;
import java.util.Random;
public enum Names {
    BenBurtt, ElissaKnight, JeffGarlin, FredWillard;

    static Names[] names = Names.values();
    static Random random=new Random();

    public static Names getNames() {
        int i =random.nextInt(names.length) ;
        return names[i];
    }
}
