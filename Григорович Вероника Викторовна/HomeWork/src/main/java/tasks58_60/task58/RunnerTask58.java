package tasks58_60.task58;

public class RunnerTask58 {
    public static void main(String[] args) {
        fileCreator.createNewFile(fileCreator.file);
        for (int i =0; i<fileCreator.fileList.size();i++){
           fileWriter.writeInFile(fileCreator.fileList.get(i));
        }

    }
}
