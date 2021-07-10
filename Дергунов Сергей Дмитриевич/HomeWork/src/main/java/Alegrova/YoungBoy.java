package Alegrova;

public class YoungBoy extends Boy {
    int age = 20;

    void YoungBoy() {
        System.out.println("Мальчик молодой");
    }

    @Override
    public void Identify() {
        System.out.println("Мальчик молодой");
    }

    @Override
    public String DoIt(Entertainment entertainment, Human human) {
        String response = "мальчик молодой ";
        if (grade instanceof MladshiyLeitenant){
            response = "младший лейтенант " + response;
            if (entertainment instanceof Dance) {
                 entertainment.getEnt();
                response += "все хотят "+entertainment.getEnt()+"с тобой!";
            }
          }
        return response;
    }

}
