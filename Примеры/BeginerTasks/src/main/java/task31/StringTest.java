package task31;

public class StringTest extends AbstractTest<String> {

    private String result="";
    private String appendStr;

    public StringTest(int repeats,String appendStr) {
        super(repeats);
        this.appendStr=appendStr;
    }

    @Override
    public void doStep() {
        result+=appendStr;
    }

    @Override
    public String getResult() {
        return result;
    }
}

