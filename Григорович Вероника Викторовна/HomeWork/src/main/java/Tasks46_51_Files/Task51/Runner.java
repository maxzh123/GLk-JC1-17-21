package Tasks46_51_Files.Task51;

import java.io.File;
import java.io.IOException;

public class Runner {

    static File dir=new File("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files");
    public static void main(String[] args) {

        Person person = new Person("h", "g", 1);
        person.generateTenPerson();
        File file = new File(dir, "Task51.txt");
        try {
             file.createNewFile();
        }
        catch(IOException ex){

            System.out.println("Какая-то ошибка");
        }
        Writer.writeInFile(file);
    }
}





