package examTasks.Task4;

import java.util.List;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Player player=new Player();
        List<Player> players=player.generate10Players();
        WriterInFile writer=new WriterInFile();
        for (int i = 0; i < CreatorFiles.fs.length; i++) {
            writer.writeInFile(CreatorFiles.fs[i], players);
            System.out.println("Данные пишутся в файл "+CreatorFiles.fs[i].getName());
       }
        return Thread.currentThread().getName();
    }
}
