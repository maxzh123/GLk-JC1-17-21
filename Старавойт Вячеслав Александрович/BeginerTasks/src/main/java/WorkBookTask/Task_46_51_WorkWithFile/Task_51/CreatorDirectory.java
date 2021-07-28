package WorkBookTask.Task_46_51_WorkWithFile.Task_51;

import java.io.File;

public class CreatorDirectory {

    protected static void creatorDirectoryNow(File file) {
        if (!file.exists()) {
            file.mkdir();
        }
    }
}