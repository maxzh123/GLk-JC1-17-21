package WorkBookTask.Task_58_60;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class Creater {
//  private final AtomicInteger fileIncrement =new AtomicInteger(0);
//  private final String str = fileIncrement.incrementAndGet()+"";
//  private final String name = "test0.txt".replace("0",str);
  protected static final String PATH = "C:\\Users\\Победитель\\GLk-JC1-17-21\\Старавойт Вячеслав Александрович\\BeginerTasks\\src\\main\\java\\WorkBookTask\\Task_58_60\\File\\";
  protected static  File file1; // file2, file3, file4, file5,file6, file7, file8, file9, file10;
  //protected static final File[] array = new File[]{file1, file2, file3, file4, file5,file6,file7,file8,file9, file10};
//  private static final String[] arrayNameFile = new String[]{"test1.txt", "test2.txt", "test3.txt", "test4.txt", "test5.txt","test6.txt", "test7.txt", "test8.txt", "test9.txt", "test10.txt"};

//  public void print(){
//  System.out.println(name);
//}


  protected static void createFile(File file,String name){
//    if (!file.exists()) { //проверяем есть ли такие каталоги,если нет то создаем.
//      file.mkdirs(); }// создали цепочку

    try {
     new File(file, name).createNewFile();
   //  file1.createNewFile();//тут поток залетел и создал себе файл
     Writer.writeInFile(new File(file, name));
    } catch (Exception e) {
      System.out.println("Ошибка по файлу, не может создать."); }
  }
}
