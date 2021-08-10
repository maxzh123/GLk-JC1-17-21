package Task52_54;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ThreadForTask54 implements Runnable{
    @Override
    public void run() {
        List <Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i <10; i ++) {
            int b = (int) (i*Math.random()*10+5);
            newArray.add(b);
        }
        File newFile = new File("D:\\Task");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataOutputStream bufferedWriter = new DataOutputStream(new FileOutputStream(newFile));
            for (int i = 0; i<newArray.size();i++) {
                bufferedWriter.writeInt(i);
                try {
                    bufferedWriter.writeInt(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newArray+" поток: "+Thread.currentThread().getName());
    }
}

