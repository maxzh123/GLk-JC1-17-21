package WorkBookTask.Task_58_60;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ObjectStateWriter {
    private final FileWriter output;
    private final BufferedWriter writer;
    private Exception e=null;

    public ObjectStateWriter(File file) {
        FileWriter output=null;
        BufferedWriter writer=null;
        try {
            output = new FileWriter(file, false); //false для того чтобы стирались данные старые.
            writer = new BufferedWriter(output);
        } catch (IOException e) {
            onError(e);
        }
        this.output=output;
        this.writer=writer;
    }


    public void write(String str){
        if (hasError()) return;
        try {
            writer.write(str);
        } catch (IOException ioException) {
            onError(ioException);
        }
    }

    private void onError(IOException e){
        this.e=e;
        e.printStackTrace();
    }

    public boolean hasError(){
        return e!=null;
    }
    public Exception getError(){
        return e;
    }

    public void close(){
        if (writer!=null){
            try {
                writer.flush();
                writer.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
