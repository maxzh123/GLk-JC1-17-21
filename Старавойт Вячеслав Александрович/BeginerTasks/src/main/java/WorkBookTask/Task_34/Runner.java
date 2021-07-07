package WorkBookTask.Task_34;

public class Runner {
    public static void main(String[] args) {
        AbstractJobStructure director =new JobDirector("Зам. директора", "Фиксированный метод");
        AbstractJobStructure engineer =new JobEngineer("Инженер охраны труда","Почасовая", 165);
        AbstractJobStructure engineerJunior =new JobEngineerJunior("Младший Инженер охраны труда","Почасовая", 165);
           director.doSalary();
        System.out.println();
           engineer.doSalary();
        System.out.println();
           engineerJunior.doSalary();

    }
}
