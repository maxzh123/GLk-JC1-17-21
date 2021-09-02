package controlWork;

import controlWork.creators.CollectFromFutureToList;
import controlWork.creators.CreatePoolAndRunTask;
import controlWork.model.Player;
import controlWork.outPut.OutputListToScreen;
import lombok.SneakyThrows;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author S.Dergunov sdergynov@gmail.com
 *
  <br>Создать класс потока(PlayerGeneratorTask), который генерирует коллекцию из 10 объектов класса
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
    public static final String filePath= "Дергунов Сергей Дмитриевич\\HomeWork\\src\\main\\java\\";

    @SneakyThrows
    public static void main(String[] args) {
        List<CompletableFuture> completableFutures = new CreatePoolAndRunTask().createPoolAndRunTask(countPlayerTask);
        List<Player>playersList = new CollectFromFutureToList().collectInOneList(completableFutures);
        OutputListToScreen toScreen = new OutputListToScreen();
        System.out.println("-------Выборка из всех файлов------------");
        toScreen.output(playersList, " ");
        System.out.println("----------Конец выборки------------");

        List<String> nickNames = new NickNamePlayersUpperCaseWithFilter().nickNamesWithFilter(playersList, 70);
        nickNames.forEach(System.out::println);

        System.out.println("Все готово.");
    }
}


