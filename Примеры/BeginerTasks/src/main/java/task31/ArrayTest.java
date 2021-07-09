package task31;

import java.util.Collection;

public class ArrayTest extends AbstractTest<String>{

    private String[] array;
    private String appendStr;
    private int idx=0;

    public ArrayTest(int repeats,String appendStr) {
        super(repeats);
        this.array= new String[repeats];
        this.appendStr=appendStr;
    }

    @Override
    public void doStep() {
        if (idx>= array.length) return;
        array[idx++]=appendStr;
    }

    @Override
    public String getResult() {
        return String.join("", array);
    }

}
