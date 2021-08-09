package WorkBookTask.Task_67_69.Task_68;

public class BuilderPerson {

    private Person newPerson;

    public BuilderPerson(){
        newPerson= new Person();
    }
    public BuilderPerson withName(String name){
        newPerson.name = name;
        return this;
    }
    public BuilderPerson withSurname(String surname){
        newPerson.surname = surname;
        return  this;
    }
    public BuilderPerson withSex(boolean sex){
        newPerson.sex=sex;
        return this;
    }
    public BuilderPerson withAge(int year){
     newPerson.year=year;
     return this;
    }
    public Person build(){
        return newPerson;
    }

}
