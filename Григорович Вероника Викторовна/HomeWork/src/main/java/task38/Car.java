package task38;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }
    @AcademyInfo
    public void someMethodWithAnnotation(){
        System.out.println("Метод с аннотацией");
    }
    public void otherMethodWithoutAnnotation() {
        System.out.println("Метод БЕЗ аннотацией");
    }


}
