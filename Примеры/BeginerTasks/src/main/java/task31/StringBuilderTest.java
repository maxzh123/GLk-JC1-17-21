package task31;

public class StringBuilderTest  extends AbstractTest<String> {

    private StringBuilder sb=new StringBuilder();
    private String appendStr;

    public StringBuilderTest(int repeats,String appendStr) {
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
