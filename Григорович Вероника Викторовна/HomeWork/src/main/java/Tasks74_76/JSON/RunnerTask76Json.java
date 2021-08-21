package Tasks74_76.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

public class RunnerTask76Json {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Map<String, Object> jSonMap=objectMapper.readValue(RunnerTask76Json.class.getClassLoader().getResourceAsStream("sample.json"), Map.class);
        for (String key:jSonMap.keySet()) {
            System.out.println(key+"->"+jSonMap.get(key));
        }
        Person person=objectMapper.readValue(RunnerTask76Json.class.getClassLoader().getResourceAsStream("sample.json"), Person.class);
        System.out.println(person);

      //  System.out.println(objectMapper.writeValueAsString(person));
    }
}
