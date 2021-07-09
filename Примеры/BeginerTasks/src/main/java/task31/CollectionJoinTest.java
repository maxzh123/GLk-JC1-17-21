package task31;

import java.util.Collection;
import java.util.List;

public class CollectionJoinTest extends AbstractTest<String> {

    private Collection<String> list;
    private String appendStr;

    public CollectionJoinTest(int repeats,String appendStr,Collection<String> collection) {
        super(repeats);
        this.list=collection;
        this.appendStr=appendStr;
    }

    @Override
    public void doStep() {
        list.add(appendStr);
    }

    @Override
    public String getResult() {
        return String.join("", list);
    }
}
