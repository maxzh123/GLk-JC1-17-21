import jul.example.anotherPackage.Inner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    @DisplayName("1 + 1 = 2")
    void firstTest() {
        Inner calculator = new Inner();
        assertEquals(2, calculator.someLittleCalculation(1, 1), "1 + 1 ДОЛЖНО БЫТЬ 2 !!!");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void additionalTest(int first, int second, int expectedResult) {
        Inner obj = new Inner();
        assertEquals(expectedResult, obj.someLittleCalculation(first, second),
                () -> first + " + " + second + " ДОЛЖНО БЫТЬ " + expectedResult +"!!!");
    }
}
