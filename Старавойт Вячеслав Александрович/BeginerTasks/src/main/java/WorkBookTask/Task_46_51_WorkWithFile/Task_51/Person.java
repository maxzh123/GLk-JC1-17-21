package WorkBookTask.Task_46_51_WorkWithFile.Task_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private int age;
    protected static int amount; // пришлось вскрыть(сделать не приват), чтобы классик WriterPerson мог увидеть кол-во людей.
    protected   static Person id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
    protected   static Person[] arrayPerson = new Person[]{id1,id2,id3,id4,id5,id6,id7,id8,id9,id10};
    private static String[] arrayName = new String[]{"Вячеслав","Владимир","Иван","Николай","Александр","Михаил","Наполеон","Барак","Джеймс","Дональд"};
    private static String[] arraySurname = new String[]{"Александров","Иванов","Петров","Наксимов","Васильев","Гедышкин","Старавойт","Великий","Федоров","Виниаминов"};

    public Person(String name,String surname,int age){ // для одиночного создания
        this.name =name;
        this.surname=surname;
        this.age=age;
    }
    public Person(int amount){ // для создания любого количества людей, но не более 10)
        this.amount=amount;
        creatorPerson(amount);
    }
    private void creatorPerson(int amount){
        if(amount<11){
        for(int i=0; i<amount;i++) {
            arrayPerson[i] = new Person(arrayName[((int) (Math.random() * 10))], arraySurname[((int) (Math.random() * 10))],((int) (Math.random() * 100 + 1))); }
        }
        else
            System.out.println("Задача стояла создать не более 10 Человек");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
