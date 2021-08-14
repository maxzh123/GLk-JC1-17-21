package Tasks61_63;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
//FIXME тут надо сделать рандом. фильтр четны. фильтр 1-20. peek . map. reduce Все!
public class Task61 { //для всех четных значениях длиной от 1 до 20 дюймов печатает на экран значения в дюймах, переводит значения в см, печатает на экран сумму в см
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20 + 1);
        double sum=new Random()
                .ints(1,20)
                .limit(n)
                .boxed()
                .filter((x)->x%2==0)
                .peek((x) ->System.out.print(x+" "))
                .mapToDouble((s)->Double.parseDouble(String.valueOf(s))*2.54)
                .peek((x) ->System.out.print(x+" "))
                .sum();
        System.out.println();
        System.out.println("Сумма в сантиметрах: "+sum);
     }
}

