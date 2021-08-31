package controlWork.creators;

import controlWork.Runner;
import controlWork.model.Player;
import controlWork.factory.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class CreatePlayersList{
   private List<Player> playersList=new ArrayList<>();

   public List<Player> createList(PlayerFactory playerResolver) {
         for (int i = 1; i <= Runner.countPlayerInList; i++) {
         playersList.add(playerResolver.getPlayer());
      }
      return playersList;
   }
}