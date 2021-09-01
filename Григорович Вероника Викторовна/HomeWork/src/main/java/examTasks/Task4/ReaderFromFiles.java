package examTasks.Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFiles {

    public synchronized List<String> readCollectionFromFile(File[] fs) {
        List<String> newPlayerList=new ArrayList<String>();
        for (int i = 0; i < CreatorFiles.fs.length; i++) {
            try (FileReader fr = new FileReader(CreatorFiles.fs[i]);
                 BufferedReader reader = new BufferedReader(fr)) {
                String line=null;
                while ((line = reader.readLine()) != null) {
                    newPlayerList.add(line);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
        }
            }
        return newPlayerList;
    }
}
