import controlWork.NickNamePlayersUpperCaseWithFilter;
import controlWork.model.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author S.Dergunov sdergynov@gmail.com
 */
class NickNamePlayersUpperCaseWithFilterTest {
    @Test
    @DisplayName("NickNameTest")
    public void getNickName() {
        Player player = new Player("Андрей 25-77", 25, 77, true);
        Player player2 = new Player("Борис 27-82", 27, 82, true);
        Player player3 = new Player("Виктор 30-91", 30, 91, true);
        Player player4 = new Player("Андрей 25-78", 25, 78, true);
        Player player5 = new Player("Борис 26-77", 26, 77, true);
        Player player6 = new Player("Андрей 29-75", 29, 75, true);
        Player player7 = new Player("Коля 28-75", 28, 75, true);
        List<Player> playerList = new ArrayList<>();

        playerList.add(player);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        playerList.add(player7);
        playerList.add(player5);
        List<String> actual = new NickNamePlayersUpperCaseWithFilter()
                .nickNamesWithFilter(playerList, 76);

        List<String> expected = new ArrayList<>();
        expected.add("АНДРЕЙ 25-77");
        expected.add("АНДРЕЙ 25-78");
        expected.add("БОРИС 26-77");
        expected.add("БОРИС 26-77");
        expected.add("БОРИС 27-82");

        assertEquals(5,actual.size());

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}