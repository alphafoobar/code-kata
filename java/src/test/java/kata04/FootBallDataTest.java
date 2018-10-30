package kata04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FootBallDataTest {

    String testStr="    1. Arsenal         38    26   9   3    79  -  36    87";
    @Test
    void stringParser() {

        assertEquals(new FootBallData("Arsenal",79,36),FootBalldataSpread.parseString(testStr));
    }

    @Test
    void LineCount() {

        assertEquals(20,FootBalldataSpread.readFile("src/resources/football.dat").size());
    }
    @Test
    void minSpread() {

        assertEquals("Aston_Villa",FootBalldataSpread.getMinSpread("src/resources/football.dat"));
    }

}
