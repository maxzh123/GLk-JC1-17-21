package generics;

import java.util.ArrayList;
import java.util.List;

public class Cell<T>{// extends Animal
    private List<T> items=new ArrayList<T>();
    T getPet(int i){
        return items.get(i);
    }

    void addPet(T... pet){
        if (pet!=null && pet.length>0){
            for(T p:pet){
                items.add(p);
            }
        }
    }
}
