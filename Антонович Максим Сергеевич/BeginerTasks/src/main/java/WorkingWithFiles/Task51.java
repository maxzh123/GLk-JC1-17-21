package WorkingWithFiles;

import java.io.*;

public class Task51 {
    public Task51() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        Person person = new Person("Max", 12,"Dgono");


            FileWriter dos = new FileWriter(new File("D:\\авв.txt"));
            dos.write(String.valueOf(person));
            dos.flush();
            dos.close();
        FileReader fileReader = new FileReader(new File("D:\\авв.txt"));
        char[] a =new char[40];
        fileReader.read(a);
        for (char c:a){
            System.out.print(c);
        }
        fileReader.close();
    }
    // добавить рандом


}
