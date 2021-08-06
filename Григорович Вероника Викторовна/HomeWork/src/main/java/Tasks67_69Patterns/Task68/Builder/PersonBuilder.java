package Tasks67_69Patterns.Task68.Builder;



public  class PersonBuilder {
private Person newPerson;

    public PersonBuilder(Person newPerson) {
        newPerson = new Person();
    }

    public PersonBuilder() {

    }



    public PersonBuilder withName(String name){
        System.out.println("Имя нашего персонажа: ");
        newPerson.name = name;
        return this;
    }

    public PersonBuilder withSurname(String surname){
        System.out.println("Фамилия нашего персонажа: ");
        newPerson.surname = surname;
        return this;
    }

    public PersonBuilder withYearOfBirth(int yearOfBirth){
        System.out.println("Год рождения нашего персонажа: ");
        newPerson.yearOfBirth = yearOfBirth;
        return this;
    }

    public Person build() {
        if (newPerson.examination()) {
            return newPerson;
        } else {
            System.out.println("Персонаж не может быть создан");
        }
        return null;
    }


}
