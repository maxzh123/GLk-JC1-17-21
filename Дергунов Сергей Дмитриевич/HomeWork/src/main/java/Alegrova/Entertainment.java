package Alegrova;

public interface Entertainment {
    boolean funny = true;
    default String Entertainment(){
        System.out.println("Развлекаться это хорошо");
        return "развлекаться";
    }

    default String getEnt(){
        return "поразвлекаться";
    }
}
