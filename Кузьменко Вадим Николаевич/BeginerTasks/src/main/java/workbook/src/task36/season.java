package task36;

public enum season {

    WINTER ("Зима"),
    SPRING ("Осень"),
    SUMMER ("Лето"),
    AUTUMN ("Весна");

    public String translation;
    season(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }

}
