package Task46;

import java.io.File;
import java.util.Scanner;

public class Main {

    private static void recurs(String dirName) {
        File dir = new File(dirName);
        System.out.println(dir.getName() + (!dir.isDirectory() ? "  - это файл а не папка" : ""));

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    recurs(name.getPath());
        }
        }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("введите путь к каталогу: ");
        String dirName = scanner.next();
        recurs(dirName);

    }
}
