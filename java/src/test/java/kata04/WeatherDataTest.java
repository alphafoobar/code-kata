package kata04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WeatherDataTest {

    String testStr="  20  84    57    71          58.9       0.00 FH      150  6.3 160  13  3.6  90 43 1032.5";
    @Test
    void stringParser() {

        assertEquals(new WeatherData(20,57,84),WeatherdataSpread.parseString(testStr));
    }

    @Test
    void LineCount() {

        assertEquals(30,WeatherdataSpread.readFile("src/resources/weather.dat").size());
    }
    @Test
    void minSpread() {

        assertEquals(14,WeatherdataSpread.getMinSpreadDay("src/resources/weather.dat"));
    }

}
