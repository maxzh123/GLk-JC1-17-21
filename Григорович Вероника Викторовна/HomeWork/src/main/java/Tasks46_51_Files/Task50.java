package Tasks46_51_Files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class Task50 {
    static int countFiles; // 5 тексовых файлов
    static int countNumbers; // 10 чисел записываем в файл
    static Path pathNextFiles;
    static Path path = Path.of("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3");

    public static void main(String[] args) throws IOException {
        Path path5 = createThreeDirectories();
        createFiveTxtFiles(path5);
        List<Path> files = createListFilesPaths();
        writeNumbersInFiles();
        createGeneralFile(files);
        createListFilesWithAllFilesAndDirectories();
    }

    public static void writeNumbersInFiles() { //я знаю что это выглядит жутко, что мне каждый раз приходится открывать файл и в него записывть, но
        // ничего другого не придумала, Максим нужна помощь. Может через цикл фор, но не могу придумать как
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile1.txt")) {
            while (countNumbers < 10) {
                fileWriter.write(String.valueOf((int) (Math.random() * 10 + 1)) + " ");
                countNumbers++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        countNumbers=0;
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile2.txt")) {
            while (countNumbers < 10) {
                fileWriter.write(String.valueOf((int) (Math.random() * 10 + 1)) + " ");
                countNumbers++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        countNumbers=0;
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile3.txt")) {
            while (countNumbers < 10) {
                fileWriter.write(String.valueOf((int) (Math.random() * 10 + 1)) + " ");
                countNumbers++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        countNumbers=0;
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile4.txt")) {
            while (countNumbers < 10) {
                fileWriter.write(String.valueOf((int) (Math.random() * 10 + 1)) + " ");
                countNumbers++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        countNumbers=0;
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile5.txt")) {
            while (countNumbers < 10) {
                fileWriter.write(String.valueOf((int) (Math.random() * 10 + 1)) + " ");
                countNumbers++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Path> createListFilesPaths () { // это понадобится потом, чтобы инфу со всех файлов записать в один
        List<Path> files = Arrays.asList(
                Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile1.txt"),
                Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile2.txt"),
                Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile3.txt"),
                Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile4.txt"),
                Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\newPapka3newFile5.txt")
        );
        return files;
    }


    public static Path createThreeDirectories () { // тут я создала 3 директории

        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return path;
    }

    public static void createFiveTxtFiles (Path path5){ //тут создала 5 текстовых файлов
        try {
            while (countFiles < 5) {
                countFiles++;
                pathNextFiles = Paths.get(path5 + "newFile" + countFiles + ".txt");
                Files.createFile(pathNextFiles);
            }
        } catch (IOException e) {
            System.out.println("Файл уже создан " + e);
        }
    }

    public static void createGeneralFile(List<Path> files) throws IOException { //тут обший файл в котором хранится инфа со всех файлов
        Path generalFile=Paths.get("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\GeneralFile.txt");

        for (Path path : files) {
            List<String> lines = Files.readAllLines(path);
            Files.write(generalFile, lines, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }
    }

    public static void createListFilesWithAllFilesAndDirectories() {

        try(DirectoryStream<Path> files=Files.newDirectoryStream(Path.of("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2"));
            FileWriter fileWriter = new FileWriter("C:\\Users\\WorkBook\\GLk-JC1-17-21\\Григорович Вероника Викторовна\\HomeWork\\src\\main\\java\\Tasks46_51_Files\\newPapka1\\newPapka2\\listFiles.txt")) {
            for (Path p : files) {
                fileWriter.write(String.valueOf(p)+" "+'\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


