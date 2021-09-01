package Exam.Task4;


public class Player {
    private Names names;
    private Integer age;
    private boolean isAlive;

    public Player(Names names, Integer age, boolean isAlive) {
        this.names = names;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Player{" +
                "names=" + names +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
