import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class ProgramLog {
    Date date = new Date ();
    File file = new File("Log");
    PrintWriter printWriter;
    {
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static ProgramLog programLog;
    private static String logFile = "This is log";

    public static ProgramLog getProgramLog () {
        if(programLog == null) {
            programLog = new ProgramLog();
        }
        return programLog;
    }
    private ProgramLog () {

    }
    public void addLogInfo (String logInfo) {
        logFile += logInfo + "\n";

    }
    public void showLogInfo () {
        System.out.println(logFile);
        System.out.println(date.toString());
        printWriter.print(logFile + date.toString());
        printWriter.close();
    }
}
