package JavaRush;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//Новая задача: Программа должна работать не с номерами домов, а с городами:

public class task8_11 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map<String,String> map =new HashMap<>();

           // List<String> list = new ArrayList<>();
            while (true) {
                String city =reader.readLine();
                if (!city.isEmpty()){
                String family = reader.readLine();
//                if (family.isEmpty() || city.isEmpty()) {
//                    break;
//                }
                map.put(city,family);}
                else
                    break;
            }

            // Read the house number
            //int houseNumber = Integer.parseInt(reader.readLine());
            System.out.println("Введите город");
                String city =reader.readLine();
                System.out.println(map.get(city));
            }
        }

