package solid;

public interface Mother extends People{
    @Override
    default void hello() {
        System.out.println("Привет солнышко");
    }
}
