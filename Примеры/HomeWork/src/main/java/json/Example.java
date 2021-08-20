package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.bean.People;

import java.io.IOException;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // JSON file to Java object
            Map<String,Object> jsonMap = mapper.readValue(Example.class.getClassLoader().getResourceAsStream("example.json"), Map.class);

            for(String key:jsonMap.keySet()){
                System.out.println(key+"->"+jsonMap.get(key));
            }

            People p = mapper.readValue(Example.class.getClassLoader().getResourceAsStream("example.json"), People.class);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
