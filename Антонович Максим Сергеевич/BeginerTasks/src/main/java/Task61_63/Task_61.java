package Task61_63;
import java.util.*;

public class Task_61 {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 1; i<=20; i++){
            list.add(i);
        }
        list.stream().filter(x->x%2==0).mapToDouble(x->x).map(x->x/2.54).forEach(x-> System.out.print("Значение в дюймах: "+x+": "));
        System.out.println();
        list.stream().filter(x->x%2==0).forEach(x-> System.out.print("значение в см - " +x+": "));
        System.out.println();
        int sum =   list.stream().filter(x->x%2==0).mapToInt(x->x).sum();
        System.out.println("Сумма в сантиметрах: "+ sum);
    }
}

