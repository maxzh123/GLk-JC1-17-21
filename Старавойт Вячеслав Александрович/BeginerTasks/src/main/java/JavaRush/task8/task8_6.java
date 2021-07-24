package JavaRush.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//        1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
//        2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
//        3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
public class task8_6 {

        public static void main(String[] args) {
            Human firstChild = new Human("Игорь", true, 15);
            Human secondChild = new Human("Светлана", false, 10);
            Human thirdChild = new Human("Виктор", true, 5);

            Human father = new Human("Андрей", true, 33, firstChild, secondChild, thirdChild);
            Human mother = new Human("Елена", false, 29, firstChild, secondChild, thirdChild);

            Human paternalGrandfather = new Human("Петр", true, 69, father);
            Human paternalGrandmother = new Human("Мария", false, 65, father);

            Human maternalGrandfather = new Human("Александр", true, 63, mother);
            Human maternalGrandmother = new Human("Ольга", false, 62, mother);


            System.out.println(paternalGrandfather);
            System.out.println(paternalGrandmother);
            System.out.println(maternalGrandfather);
            System.out.println(maternalGrandmother);
            System.out.println(father);
            System.out.println(mother);
            System.out.println(firstChild);
            System.out.println(secondChild);
            System.out.println(thirdChild);
        }

        public static class Human {
            String name;
            boolean sex;
            int age;

            List<Human> children = new ArrayList<>();

            public Human(String name, boolean sex, int age) {
                this.name = name;
                this.sex = sex;
                this.age = age;
            }

            public Human(String name, boolean sex, int age, Human... children) {
                this.name = name;
                this.sex = sex;
                this.age = age;

                Collections.addAll(this.children, children);
            }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
