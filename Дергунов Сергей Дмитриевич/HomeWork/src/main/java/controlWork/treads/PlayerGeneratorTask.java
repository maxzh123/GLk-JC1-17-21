package controlWork.treads;

import controlWork.creators.CreatePlayersList;
import controlWork.Runner;
import controlWork.model.Player;
import controlWork.outPut.OutputListToFile;
import controlWork.factory.GenerateRandom;
import controlWork.factory.PlayerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author S.Dergunov sdergynov@gmail.com
 * <br>Создать класс потока(PlayerGeneratorTask),
 * который генерирует коллекцию из 10 объектов класса Player с полями
 * name(String), age(Integer), isActive(boolean) по условию: name – любое, age – от 20 до 40, isActive – true/false
 * и записывает ее в файл. Поток возвращает имя файла, в который он писал.
 */
public class PlayerGeneratorTask {
    public static volatile AtomicInteger fileCounter = new AtomicInteger(0);

    static public String playerGeneratorTask(){
        System.out.println("Генератор запущен");
        String filePath = String.format(Runner.filePath + "examWork_%d.lst",fileCounter.getAndIncrement());
        PlayerFactory playerResolver = new GenerateRandom();
        List<Player> playersList = new CreatePlayersList().createList(playerResolver);
        OutputListToFile outputListToFile = new OutputListToFile();
        outputListToFile.output(playersList,filePath);
        System.out.println("Генерация и запись в файл завершена: "+filePath);
        return filePath;
    }
}
