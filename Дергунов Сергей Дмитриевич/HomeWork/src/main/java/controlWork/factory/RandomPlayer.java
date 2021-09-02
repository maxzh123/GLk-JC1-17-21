package controlWork.factory;

import controlWork.Runner;
import controlWork.model.Name;
import controlWork.model.Nick;
import controlWork.model.Player;

import java.util.Random;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */

public class RandomPlayer implements PlayerFactory {

    @Override
    public Player getPlayer() {
        Random random = new Random();
        int age = random.ints(Runner.minAge, Runner.maxAge).findFirst().getAsInt();
        Name name = Name.values()[(int) (Math.random() * Name.values().length)];
        Nick nick = Nick.values()[(int) (Math.random() * Nick.values().length)];
        int midiChloriansLevel = (int) (Math.random() * 100);
        boolean isActive = random.nextBoolean();
        String nickName = name + "-"+nick;
        return new Player(nickName, age, midiChloriansLevel, isActive);
    }
}
