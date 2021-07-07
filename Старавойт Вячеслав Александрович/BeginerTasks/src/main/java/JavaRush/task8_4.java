package JavaRush;
///.      Ввести с клавиатуры число N.
//        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//        3. Найти минимальное число среди элементов списка - метод getMinimum.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task8_4 {

        public static void main(String[] args) throws Exception {
            List<Integer> integerList = getIntegerList();
            System.out.println(getMinimum(integerList));
        }

        public static int getMinimum(List<Integer> array) {
            return Collections.min(array);
        }

        public static List<Integer> getIntegerList() throws IOException {
            BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            List<Integer> list =new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                list.add(Integer.parseInt(reader.readLine()));
}
            return list;
        }
    }

