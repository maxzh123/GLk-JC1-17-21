package JavaRush.LambdaFunction.Sort;

public class Student {
    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Студент - " +
                name+
                ", возраст - " + age +
                '.';
    }

    public String getName() {
        return name;
    }
}
