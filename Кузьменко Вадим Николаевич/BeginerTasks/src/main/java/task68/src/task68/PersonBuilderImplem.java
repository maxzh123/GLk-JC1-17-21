package task68;

public class PersonBuilderImplem implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setYear(int year) {
        person.year = year;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
