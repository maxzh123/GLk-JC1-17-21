package WorkBookTask.Task_74_76.Task_76New;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class People {

    @JsonProperty("isId")
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private boolean permanent;
    @JsonProperty
    private Map<String, String> address;
    @JsonProperty
    private List<Integer> phoneNumbers;
    private String role;
    private List<String> cities;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getRole() {
        return role;
    }

    public List<String> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                '}';
    }

//    public void setPhoneNumbers(List<Integer> phoneNumbers) {
//        this.phoneNumbers = phoneNumbers;
//    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
