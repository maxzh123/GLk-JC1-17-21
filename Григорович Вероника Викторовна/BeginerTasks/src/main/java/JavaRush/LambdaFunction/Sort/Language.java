package JavaRush.LambdaFunction.Sort;

public class Language {
    String name;
    Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }


    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Язык прогрммирования - " + name +
                ", рейтинг - " + ranking + "% опрошенных.";
    }
}
