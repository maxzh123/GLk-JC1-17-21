package WorkingWithFiles;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;

import static java.lang.String.valueOf;

public class Task50 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Homework\\Tasks\\1.txt");
        File file2 = new File("D:\\Homework\\Tasks\\2.txt");
        File file3= new File("D:\\Homework\\Tasks\\3.txt");
        File file4 = new File("D:\\Homework\\Tasks\\4.txt");
        File file5 = new File("D:\\Homework\\Tasks\\5.txt");

        File file6 = new File("D:\\Homework\\Tasks\\6.txt");

        String file1Str = FileUtils.readFileToString(file1, Charset.defaultCharset());
        String file2Str = FileUtils.readFileToString(file2, Charset.defaultCharset());
        String file3Str = FileUtils.readFileToString(file3, Charset.defaultCharset());
        String file4Str = FileUtils.readFileToString(file4, Charset.defaultCharset());
        String file5Str = FileUtils.readFileToString(file5, Charset.defaultCharset());


        FileUtils.write(file6, file1Str, Charset.defaultCharset());
        FileUtils.write(file6, file2Str, Charset.defaultCharset(), true);
        FileUtils.write(file6, file3Str, Charset.defaultCharset(), true);
        FileUtils.write(file6, file4Str, Charset.defaultCharset(), true);
        FileUtils.write(file6, file5Str, Charset.defaultCharset(), true);

        //доделать вывод файлов

//       File ar= new File("D:\\Homework\\Tasks");
//       BufferedWriter are = new BufferedWriter(new FileWriter( new File("D:\\Homework\\Tasks")));
//        for (File a: ar.listFiles()){
//            System.out.println(a.getName());
//        }
    }
}