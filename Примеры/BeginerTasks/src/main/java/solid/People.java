package solid;

public interface People {
        default void hello() {
            System.out.println("Привет");
        }
}
