package controlWork.treads;

import controlWork.creators.CreatePlayersListFromFile;
import controlWork.Runner;
import controlWork.model.Player;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author S.Dergunov sdergynov@gmail.com
 * <br>Создать класс потока(PlayerReaderTask), который читает файл и возвращает коллекцию активных Player
в возрастном диапазоне от 25 до 30.

 */
public class PlayerReaderTask {

    public static List<Player> PlayerReaderTask(String filePath){
        System.out.println("Запущен поток чтения из файла:" + filePath);
        List<Player> playersList = null;
        try {
            playersList = new CreatePlayersListFromFile().CreateList(filePath);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert playersList != null;
        System.out.println("Завершение чтения из файла"+filePath);
        return playersList.stream().
                filter(x -> x.getAge()>= Runner.minAcceptableAge &&x.getAge()<=Runner.maxAcceptableAge&&x.isActive())
                .collect(Collectors.toList());
    }
}
