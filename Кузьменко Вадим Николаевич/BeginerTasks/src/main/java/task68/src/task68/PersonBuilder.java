package task68;

public interface PersonBuilder {
PersonBuilder setName (String name);
PersonBuilder setYear (int year);
PersonBuilder setSurname (String surname);
Person build ();
}
