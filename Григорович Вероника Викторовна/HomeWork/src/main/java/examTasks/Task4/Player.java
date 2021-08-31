package examTasks.Task4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player implements Serializable {
    String name;
    int age;
    boolean isActive;

    public Player(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public Player() {
    }


    public List<Player> generate10Players() {
        List<Player> playersList=new ArrayList<Player>();
        for (int i = 0; i < 10; i++) {
            playersList.add(new Player(String.valueOf(Names.getNames()), (int) (Math.random() * 20 + 20), new Random().nextBoolean()));
        }
        return playersList;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
