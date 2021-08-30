package controlWork;

import controlWork.model.Player;
import controlWork.resolver.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class CreatePlayersList{
   private List<Player> playersList=new ArrayList<>();

   public List<Player> CreateList(PlayerResolver playerResolver) {
         for (int i = 1; i <= Runner.countPlayerInList; i++) {
         playersList.add(playerResolver.getPlayer());
      }
      return playersList;
   }
}