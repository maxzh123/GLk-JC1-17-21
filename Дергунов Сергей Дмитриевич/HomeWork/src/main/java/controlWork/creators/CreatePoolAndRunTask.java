package controlWork.creators;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import controlWork.treads.PlayerGeneratorTask;
import controlWork.treads.PlayerReaderTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
public class CreatePoolAndRunTask {
    public List<CompletableFuture> createPoolAndRunTask(int countPlayerTask){
        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setDaemon(true)
                .build();
        Executor executor = Executors.newFixedThreadPool(4,threadFactory);
        ArrayList<CompletableFuture> list = new ArrayList<>();
        for (int i = 1; i <= countPlayerTask; i++) {
            System.out.println("Запущен поток: "+i);
            list.add(CompletableFuture
                    .supplyAsync(PlayerGeneratorTask::playerGeneratorTask,executor)
                    .thenApply(PlayerReaderTask::playerReaderTask)
                    );
        }
    return list;
    }
}
