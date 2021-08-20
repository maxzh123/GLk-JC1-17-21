package json.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class People {
    @JsonProperty("name")
    private String name;
    private int age;

    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }
}
