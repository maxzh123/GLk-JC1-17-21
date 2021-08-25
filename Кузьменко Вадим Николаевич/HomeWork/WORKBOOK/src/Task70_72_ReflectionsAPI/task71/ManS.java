package Task70_72_ReflectionsAPI.task71;

public class ManS {
    private String name="очень вредная";
    private int age=0;
    private String surname="Вредня Вероника";

    public ManS() {}

    public ManS(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    void Age2() {
        int doobleAge = age * 2;
    }
    void FIO() {
        String doobleName = name + surname;
    }
    public String balbla (String name) {
        System.out.println("My name is.." + name + " " + surname + ", " + "мне" + age + "лет" );
        return name;
    }
}
