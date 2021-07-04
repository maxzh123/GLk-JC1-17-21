package Alegrova;

public class Boy extends Human{
    String sex = "Male";

    void Boy(){
        System.out.println("Мальчик сам по себе");
    }
    @Override
    public void Identify(){
        System.out.println("Не просто человек разумный, а мальчик");
    }
    @Override
    public String DoIt(Entertainment entertainment,Human human){
                if(entertainment instanceof Dance){
                    return "Мальчик и танцы (Плохому танцору...)";
        }
      return "мальчик";
    }
}
