package task31;

public class StringBufferTest extends AbstractTest<String> {

    private StringBuffer sb=new StringBuffer();
    private String appendStr;

    public StringBufferTest(int repeats,String appendStr) {
        super(repeats);
        this.appendStr=appendStr;
    }

    @Override
    public void doStep() {
        sb.append(appendStr);
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
