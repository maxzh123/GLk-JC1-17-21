package WorkBookTask.Task_67_69.Task_68;


public class Person {

    protected String name;
    protected String surname;
    protected int year;
    protected boolean sex;

    @Override
    public String toString() {
        return "Человек {" + name +" "+ surname + ". Возраст: " + year +
                ".Пол: " + sex +
                '}';
    }
}
