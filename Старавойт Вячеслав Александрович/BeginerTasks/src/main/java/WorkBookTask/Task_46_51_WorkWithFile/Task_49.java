package WorkBookTask.Task_46_51_WorkWithFile;

import java.io.*;
import java.util.ArrayList;

public class Task_49 {
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String path = "/Users/Победитель/GLk-JC1-17-21/Старавойт Вячеслав Александрович/BeginerTasks/src/main/java/WorkBookTask/Task_46_51_WorkWithFile/test.dat";
        DataOutputStream a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
       // BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        // FileOutputStream f = new FileOutputStream(path);
        for (int i = 0; i < 20; i++) {
            a.writeInt(i);
        }
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
    }
        catch (FileNotFoundException e){
            System.out.println("File is not found");
            return;
        }
        int res =dataInputStream.readInt();
        while (true){
            System.out.println(res);
            try {
                res =dataInputStream.readInt();
            }
            catch ( EOFException e1) {
                break;
            }
        }
        if(dataInputStream!=null){
            dataInputStream.close();
        }

    }
}
