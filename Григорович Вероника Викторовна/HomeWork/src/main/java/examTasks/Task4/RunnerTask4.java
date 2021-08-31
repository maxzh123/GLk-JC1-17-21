package examTasks.Task4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerTask4 {
    static List<Future<String>> futureList = new ArrayList<Future<String>>();
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        CreatorFiles files=new CreatorFiles();
        files.createFile();
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        for (int i = 0; i < 20; i++) {
            Future<String> future=executorService.submit(new PlayerGeneratorTask());
            futureList.add(future);
        }
        while (futureList.size() > 0) {
            Iterator<Future<String>> iterator = futureList.iterator();
            while (iterator.hasNext()) {
                Future<String> stringFuture = iterator.next();
                if (stringFuture.isDone()) {
                    System.out.println("Задача завершена у потока " + stringFuture.get());
                    iterator.remove();
                }
            }
        }
        executorService.shutdown();
        ReaderFromFiles reader=new ReaderFromFiles();
        List<String>newPlayerList=reader.readCollectionFromFile(CreatorFiles.fs);
        System.out.println(newPlayerList);


        Player player=new Player();
        List<Player>playerList=player.generate10Players();
        Stream<Player> playerStream=playerList.stream();
        ArrayList<String> nextPLayerList;
        nextPLayerList=(ArrayList<String>) playerStream
                .filter(player1 -> player1.age>=25&&player1.age<=30)
                .filter(player1 -> player1.isActive)
                .limit(5)
                .map(player1->player1.name.toUpperCase())
                .collect(Collectors.toList());
        nextPLayerList.forEach(System.out::println);

    }
}
