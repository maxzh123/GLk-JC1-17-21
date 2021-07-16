package generics;

import java.util.Collection;
import java.util.List;

public class Utils {

    static public void Покормить2(Cell<? super Animal> pet){

    }
    static public void Покормить(Cell<? extends Animal> pet){

    }
    static public <T,K> T getFirst(Cell<T> cell, List<K> lst){
        K item=lst.get(0);
        return cell.getPet(0);
    }
}
