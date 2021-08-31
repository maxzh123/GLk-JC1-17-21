package examTasks.task3;

import com.google.common.collect.Multimap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriterInFile {

    public void writeInFile(Multimap<Integer, Car> carMap) {

        try(FileWriter fileWriter=new FileWriter("ExamTask3", false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {
            List<Car> carEngine1= (List<Car>) carMap.get(1);
            bufferedWriter.write(String.valueOf(carEngine1));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
