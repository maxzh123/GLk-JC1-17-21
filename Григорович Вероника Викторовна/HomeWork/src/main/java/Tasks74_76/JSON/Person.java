package Tasks74_76.JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Person {
@JsonProperty("id2") //если название поля в json и в классе не совпадают
    private int id;
@JsonProperty //если совпадают то в скобках можно ничего не писать  и это надо для того если нет сеттеров
    private String name;
@JsonProperty
    private boolean permanent;
@JsonProperty
    private Map<String, String> address;

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

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPermanent(boolean permanent) {
//        this.permanent = permanent;
//    }
//
//    public void setAddress(Map<String, String> address) {
//        this.address = address;
//    }
}
