package controlWork.outPut;

import controlWork.model.Player;

import java.util.List;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
public class OutputListToScreen implements OutputList {
    @Override
    public void output(List<Player> playerList, String string) {
            playerList.forEach(System.out::println);
        }
    }

