package controlWork.creators;

import controlWork.model.Player;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class CreatePlayersListFromFile{

    public List<Player> CreateList(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Player> playerList = (List<Player>) objectInputStream.readObject();
        fileInputStream.close();
        return playerList;
    }
}