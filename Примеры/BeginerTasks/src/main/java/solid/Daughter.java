package solid;

public interface Daughter extends  People{
    @Override
    default void hello() {
        System.out.println("Чо купили?");
    }

}
