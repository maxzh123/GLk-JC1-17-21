package WorkBookTask.Task_74_76.Task_76New;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Runner {
    public static void main(String[] args) throws IOException {
            ObjectMapper objectMapper=new ObjectMapper();
            Map<String, Object> jSonMap=objectMapper.readValue(Runner.class.getClassLoader().getResourceAsStream("ex1.json"), Map.class);
            for (String key:jSonMap.keySet()) {
                System.out.println(key+"->"+jSonMap.get(key));
            }
            People people=objectMapper.readValue(Runner.class.getClassLoader().getResourceAsStream("ex1.json"), People.class);
            System.out.println(people);

            //  System.out.println(objectMapper.writeValueAsString(person));
        }

    }

