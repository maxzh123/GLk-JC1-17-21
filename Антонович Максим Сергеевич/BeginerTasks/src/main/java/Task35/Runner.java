package Task35;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        for (Enum f:Enum.values()){
            System.out.println(f.name());
        }
        System.out.println(Arrays.toString(Enum.values()));
    }
}
