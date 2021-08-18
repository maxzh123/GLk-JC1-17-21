package WorkBookTask.Task_67_69.Task_68;

public class Runner {

    public static void main(String[] args) {
     Person myPerson =new BuilderPerson()
             .withName("Slava")
             .withSurname("Staravoyt")
             .withSex(true)
             .withAge(1991)
             .build();

        System.out.println(myPerson);
    }
}
