package task61.src.task61;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//FIXME Почти.... в конце нужен не фоич а редьюс
public class Main {

       public static void main(String[] args) {
        List<Integer> numbers = createList();
        transformationStream(numbers);}

    private static List<Integer> createList(){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i =1; i<=20;i++){
            numbers.add(i);
        }
        return numbers;
    }
    private static void transformationStream(List<Integer> list){
        Stream<Integer> stream;
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        System.out.println();
        list.stream().filter(x->x%2==0).mapToDouble(x->x*2.54).forEach(x1->System.out.print(""+x1+" см "));
        System.out.println();
    }
}


