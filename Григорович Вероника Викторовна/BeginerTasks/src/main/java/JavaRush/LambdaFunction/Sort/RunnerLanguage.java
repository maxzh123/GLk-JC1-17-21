package JavaRush.LambdaFunction.Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class RunnerLanguage {
    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<Language>();
        Collections.addAll(languages,
                new Language("C#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Phyton", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("C", 15.95),
                new Language("Java", 13.48));
        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        return
                languages.stream()
                        .sorted(Comparator.comparingDouble(Language::getRanking));

    }
}
