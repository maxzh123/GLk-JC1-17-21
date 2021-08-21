package json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import json.bean.People;

import java.io.IOException;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            // JSON file to Java object
            Map<String,Object> jsonMap = mapper.readValue(Example.class.getClassLoader().getResourceAsStream("example.json"), Map.class);

            for(String key:jsonMap.keySet()){
                System.out.println(key+"->"+jsonMap.get(key));
            }

            People p = mapper.readValue(Example.class.getClassLoader().getResourceAsStream("example.json"), People.class);
            System.out.println(p);
            System.out.println(mapper.writeValueAsString(p));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
