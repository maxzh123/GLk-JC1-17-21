package Task58__60;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallableForTask59 implements Callable<List<String>> {
   // List<String> list = new ArrayList<String>();

    @Override
    public List<String> call() throws Exception {
        List<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                list.add(String.valueOf((int) (j * Math.random() * 10) + 25));
            }
            Thread.sleep((long) (Math.random() * 10));
            String result = null;
            for (int k = 0; k < list.size(); k++) {
                result += list.get(k);
            }
           list1.add(result);
        }
        return list1;
    }
}
