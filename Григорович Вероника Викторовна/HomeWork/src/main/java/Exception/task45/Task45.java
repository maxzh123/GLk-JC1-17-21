package Exception.task45;


public class Task45 {

    public static void main(String[] args) throws Exception{

        Cat cat = new Cat();
        cat.eat(new Food("мясо"));
        cat.eat(null);

    }
}
