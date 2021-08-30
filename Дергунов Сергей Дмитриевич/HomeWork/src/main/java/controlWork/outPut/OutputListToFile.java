package controlWork.outPut;

import controlWork.model.Player;

import java.io.*;
import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class OutputListToFile implements OutputList {

    private void CreateNewFile(String filePath) throws IOException {
        File path = new File(filePath);
        if (!path.createNewFile()) {
            path.delete();
            path.createNewFile();
        }
    }

    private void WriteToMyFile(List<Player> playerList, String filePath) throws IOException, FileNotFoundException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(playerList);
        objectOutputStream.close();
    }

    @Override
    public void Output(List<Player> playerList, String filePath) {
        try {
            CreateNewFile(filePath);
        } catch (IOException e) {
            System.out.printf("ERROR! Can't create file.%s",filePath);
            e.printStackTrace();
        }
        try {
            WriteToMyFile(playerList,filePath);
        } catch (IOException e) {
            System.out.printf("ERROR! Can't write to file.%s",filePath);
            e.printStackTrace();
        }
        System.out.println("Write to file successfully.");
    }
}
