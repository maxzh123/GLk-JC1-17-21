package task62;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//FIXME сортировка выполнена не верно. Агрегации в колекцию нет.
public class Main {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();
        peoples.add (new People("Vadim", 15, "Ivanov" ));
        peoples.add (new People("Stive", 25, "Smith" ));
        peoples.add (new People("Roger", 24, "Smith" ));
        peoples.add (new People("Dmitry", 24, "Petrov" ));
        peoples.add (new People("Ken", 22, "Jackson" ));
        peoples.add (new People("Jack", 30, "Vorobey" ));
        peoples.add (new People("Neo", 29, "izmatrici" ));
        peoples.add (new People("Tom", 28, "Cat" ));
        peoples.add (new People("Jarry", 16, "Hatecate" ));
        peoples.add (new People("Leonardo", 17, "Dayvinchik" ));
        peoples.add (new People("Donatello", 22, "Smirnoff" ));
        peoples.add (new People("Rafael", 23, "Federer" ));
        peoples.add (new People("Mickelangelo", 20, "Sobolev" ));
        peoples.add (new People("Jimmy", 27, "Jimmy" ));
        peoples.add (new People("Acha", 28, "Acha" ));
        peoples.add (new People("Rabbit", 19, "Roger" ));
        peoples.add (new People("Simon", 24, "Slevin" ));
        peoples.add (new People("Agent", 25, "Fake" ));
        peoples.add (new People("Piter", 27, "Parker" ));
        peoples.add (new People("Shone", 28, "Connery" ));
        peoples.add (new People("Oleg", 16, "Gelo" ));

        peoples.stream()
                .filter(people -> people.getAge() < 21)
                .sorted((Comparator.comparing(People::getName)))
                .sorted((Comparator.comparing(People::getSurname)))
                .limit(4)
                .map(people -> people.getName() + " " + people.getSurname())
                .forEach(System.out::println);

    }
}

