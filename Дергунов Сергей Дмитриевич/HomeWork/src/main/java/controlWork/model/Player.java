package controlWork.model;

import java.io.Serializable;

public class Player implements Serializable {
    private final String nickName;
    private final int age;
    private final int midiChloriansLevel;

    private final boolean isActive;

    public Player(String nickName, int age, int midiChloriansLevel, boolean isActive) {
        this.nickName = nickName;
        this.age = age;
        this.midiChloriansLevel = midiChloriansLevel;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", midiСhloriansLevel=" + midiChloriansLevel +
                ", isActive=" + isActive +
                '}';
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getMidiChloriansLevel() {
        return midiChloriansLevel;
    }

    public String getNickName() {
        return nickName;
    }
}


