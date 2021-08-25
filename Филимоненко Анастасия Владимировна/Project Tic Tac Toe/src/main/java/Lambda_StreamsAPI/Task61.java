package Lambda_StreamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task61 {
    public static void main(String[] args) {
        List<Integer> list = createList();
        transformationStream(list);}

    private static List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        for(int i =1; i<=20;i++){
            list.add(i);
        }
        return list;
    }
    private static void transformationStream(List<Integer> list){
        Stream<Integer> stream;
        list.stream().filter(x->x%2==0).forEach(x1->System.out.print("["+x1+" inch] "));
        System.out.println();
        list.stream().filter(x->x%2==0).mapToDouble(x->x*2.54).forEach(x1->System.out.print("["+x1+" cm] "));
        System.out.println();
    }
}
