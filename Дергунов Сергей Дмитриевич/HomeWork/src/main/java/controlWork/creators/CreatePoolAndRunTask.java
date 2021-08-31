package controlWork.creators;

import controlWork.treads.PlayerGeneratorTask;
import controlWork.treads.PlayerReaderTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
public class CreatePoolAndRunTask {
    public List<CompletableFuture>CreatePoolAndRunTask(int countPlayerTask){
        Executor executor = Executors.newWorkStealingPool(4);
        ArrayList<CompletableFuture> list = new ArrayList<>();
        for (int i = 1; i <= countPlayerTask; i++) {
            System.out.println("Запущен поток: "+i);
            list.add(CompletableFuture
                    .supplyAsync(PlayerGeneratorTask::PlayerGeneratorTask,executor)
                    .thenApply(PlayerReaderTask::PlayerReaderTask)
                    );
        }

    return list;
    }
}
