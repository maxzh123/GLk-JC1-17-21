package controlWork.model;

import java.io.Serializable;

public class Player implements Serializable {
    private String nickName;
    private int age;
    private int midiСhloriansLevel;
    private boolean isActive;

    public Player(String nickName, int age, int midiСhloriansLevel, boolean isActive) {
        this.nickName = nickName;
        this.age = age;
        this.midiСhloriansLevel = midiСhloriansLevel;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", midiСhloriansLevel=" + midiСhloriansLevel +
                ", isActive=" + isActive +
                '}';
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}


