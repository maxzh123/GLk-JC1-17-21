package task36;

public enum season {

    WINTER ("Зима"),
    SPRING ("Осень"),
    SUMMER ("Лето"),
    AUTUMN ("Весна");

    private String translation;
    season(String translation) {
        this.translation = translation;
    }
    private String getTranslation() {
        return translation;
    }

}
