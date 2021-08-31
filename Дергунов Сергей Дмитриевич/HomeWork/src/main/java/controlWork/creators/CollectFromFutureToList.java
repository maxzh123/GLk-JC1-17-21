package controlWork.creators;

import controlWork.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
public class CollectFromFutureToList {
    public List<Player> CollectInOneList(List<CompletableFuture> completableFutureList) throws ExecutionException, InterruptedException {
        List<Player> playerList=new ArrayList<>();
            for (CompletableFuture<Player> cf : completableFutureList) {
                List<Player> temp = (List<Player>) cf.get();
                playerList.addAll(temp);
                }
        return playerList;
    }
}
