package controlWork.outPut;

import controlWork.model.Player;

import java.io.*;
import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class OutputListToFile implements OutputList {

    private void createNewFile(String filePath) throws IOException {
        File path = new File(filePath);
        if (!path.createNewFile()) {
            path.delete();
            path.createNewFile();
        }
    }

    private void writeToMyFile(List<Player> playerList, String filePath) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(playerList);
        objectOutputStream.close();
    }

    @Override
    public void output(List<Player> playerList, String filePath) {
        try {
            createNewFile(filePath);
        } catch (IOException e) {
            System.out.printf("ERROR! Can't create file.%s", filePath);
            e.printStackTrace();
        }
        try {
            writeToMyFile(playerList, filePath);
        } catch (IOException e) {
            System.out.printf("ERROR! Can't write to file.%s", filePath);
            e.printStackTrace();
        }
    }
}
