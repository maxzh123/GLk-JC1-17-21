package Tasks67_69Patterns.Task68.Builder;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    String name;
    String surname;
    int yearOfBirth;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.yearOfBirth = personBuilder.yearOfBirth;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Год рождения=" + yearOfBirth +
                '}';
    }

    public static class PersonBuilder {
        static String regex="[а-яёА-ЯЁ]*[-]*[а-яёА-ЯЁ]+";
        String name;
        String surname;
        int yearOfBirth;

        public PersonBuilder() {
            super();
        }

        public PersonBuilder withName(String name) {
            //сделала ещё чтобы даже если первая буква
            //введена маленькая менялась на заглавную
            //а остальные буквы чтобы были строчными даже если введены заглавными
            this.name = Character.toUpperCase(name.charAt(0))+name.substring(1).toLowerCase(Locale.ROOT);;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            this.surname = Character.toUpperCase(surname.charAt(0))+surname.substring(1).toLowerCase(Locale.ROOT);
            //сделала ещё чтобы даже если первая буква
            //введена маленькая менялась на заглавную
            //а остальные буквы чтобы были строчными даже если введены заглавными
            return this;
        }

        public PersonBuilder withYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public boolean examination() { //метод проверки
            return (name != null && !name.trim().isEmpty() && surname != null && !surname.trim().isEmpty() && yearOfBirth > 1900 && onlyCyrillic());
        }

        public boolean onlyCyrillic() { //тут я делаю доп роверку чтоюы имя и фамилия были написаны только на кириллице
            Pattern pattern=Pattern.compile(regex);
            Matcher matcherName=pattern.matcher(name);
            Matcher matcherSurname=pattern.matcher(surname);
            if(matcherName.find() && matcherSurname.find()) {
                return true;
            } else {
                return false;
            }
        }


        public Person build() {
            Person person = null;
            if (examination()) {
                person = new Person(this);
            } else {
                System.out.println("Персонаж не может быть создан");
            }
            return person;
        }
    }
}



