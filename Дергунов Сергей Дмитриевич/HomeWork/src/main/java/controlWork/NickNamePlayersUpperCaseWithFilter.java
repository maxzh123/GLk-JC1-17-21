package controlWork;

import controlWork.model.Player;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
public class NickNamePlayersUpperCaseWithFilter {
    public List<String> nickNamesWithFilter(List<Player> playersList, int midiChlorianLimit) {
        //                .forEach(x -> System.out.println(x));
        return playersList
                .stream()
                .filter(x -> x.getMidiChloriansLevel() > midiChlorianLimit)
                .sorted(Comparator.comparing(Player::getAge)
                        .thenComparing(Player::getMidiChloriansLevel))
                .limit(5)
                .map(x -> x.getNickName().toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
    }
}
