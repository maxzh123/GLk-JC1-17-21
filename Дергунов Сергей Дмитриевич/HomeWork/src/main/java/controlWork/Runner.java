package controlWork;

import controlWork.model.Player;
import controlWork.outPut.OutputListToScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *  * @author S.Dergunov sdergynov@gmail.com
 *
  Создать класс потока(PlayerGeneratorTask), который генерирует коллекцию из 10 объектов класса
 Player с полями name(String), age(Integer), isActive(boolean) по условию: name – любое, age – от 20 до 40,
 isActive – true/false и записывает ее в файл. Поток возвращает имя файла, в который он писал.

Создать класс потока(PlayerReaderTask), который читает файл и возвращает коллекцию активных Player
 в возрастном диапазоне от 25 до 30.

Создать пул потоков из 4 штук
Запустить 20 потоков класса PlayerGeneratorTask.
Запустить поток класса PlayerReaderTask на каждый выполненный PlayerGeneratorTask.

Отсортировать по возрасту и вывести на экран имена 5 игроков в UpperCase,
 удовлетворяющие условию с помощью Stream API.
*/

public class Runner {
    public static final int maxAge = 40;
    public static final int minAge = 20;
    public static final int minAcceptableAge = 25;
    public static final int maxAcceptableAge = 30;
    public static final int countPlayerTask = 20;
    public static final int countPlayerInList = 10;
    public static volatile int fileCounter= 0;
    static private List<Player> playersList = new ArrayList<>();
    public static final String filePath= "Дергунов Сергей Дмитриевич\\HomeWork\\src\\main\\java\\";

    public static void main(String[] args){
        OutputListToScreen outputListToScreen = new OutputListToScreen();
        try {
            new CreatePoolAndRunTask().CreatePoolAndRunTask(countPlayerTask);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
//        String fileName= new  PlayerGeneratorTask().PlayerGeneratorTask();
//        List<Player> playersList2 = new ArrayList<>();
//        try {
//            playersList2 = new PlayerReaderTask().PlayerReaderTask(fileName);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("---------------------------------------");
//        outputListToScreen.Output(playersList2," ");
    }

//        CreatePersonsList();
//        Stream<HomeWork62.Person> streamPersons = personsList.stream();
//        PrintList(personsList);
//        System.out.println();
//        acceptableSurnames = (ArrayList<String>) streamPersons.
//                filter(x -> x.age < 21).                            //Фильтр возраст менее 21
//                peek(System.out::println).                          //напечатать
//                sorted(Comparator.comparing(HomeWork62.Person::getSurname).    //сортировать по фамилии
//                thenComparing(HomeWork62.Person::getName)).                    //затем по имени
//                limit(4).                                           //лимит элементов - первые 4
//                map(HomeWork62.Person::getSurname).                            //взять фамилии
//                collect((Collectors.toList()));                     // положить в коллекцию
//        System.out.println();
//        PrintSurnameList(acceptableSurnames);
 //     }



}
