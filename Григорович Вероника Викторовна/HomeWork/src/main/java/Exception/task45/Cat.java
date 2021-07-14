package Exception.task45;

import Exception.task45.Food;

public class Cat {

    public void eat(Food food) throws Exception {
        if (food.foodName==null) {
            throw new Exception();
        } else {
            System.out.println("Кот накормлен");
        }

    }
}
