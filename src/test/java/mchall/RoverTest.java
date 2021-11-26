package mchall;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {

//    @Test
//    public void returnStartingPositionOfRoverWithoutAnyCommand(){
//        final String emptyCommand = "";
//
//        Assertions.assertEquals(("1 2 N"), new Rover (1,2, "N").execute(emptyCommand));
//    }

    @ParameterizedTest
    @CsvSource({
            "55, '12N M', '13N'",
            "55, '12N M 33N MMM', '13N 36N'",
            "55, '12E M 23E MMM', '22E 53E'",
            "55, '32E M 13E MMMM', '42E 53E'",
            "55, '32W M 53W MMM', '22W 23W'",
            "55, '43W M 56W MMM', '33W 26W'",
            "55, '22S M 55S MMM', '21S 52S'",
            "55, '24S M 55S MMMM', '23S 51S'"
    })
    public void moveRover(String upperRightCoordinates, String commands, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, Launcher.launchRovers(upperRightCoordinates, commands));
    }

    @ParameterizedTest
    @CsvSource({
            "55, '12N M', '13N'"
    })
    public void turnRover(String upperRightCoordinates, String commands, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, Launcher.launchRovers(upperRightCoordinates, commands));
    }


    //"55, '12N M 33E MMM', '13N 36E'"
    //"55, '12N M', '13N'"
    //"55, '12N LMLMLMLMM 33E MMRMMRMRRM', '13N 51E'"

   /* @ParameterizedTest
    @CsvSource({
            "1, 2, N, M, '1 3 N'",
            "1, 3, N, MM, '1 5 N'",
            "1, 8, S, MM, '1 6 S'",
            "1, 8, S, MMMMMM, '1 2 S'",
            "5, 2, W, MMM, '2 2 W'",
            "8, 2, W, MMMMM, '3 2 W'",
            "2, 2, E, MMM, '5 2 E'",
            "3, 2, E, MM, '1 2 E'"
    }) */
    /*public void moveRover(int initialX, int initialY, String initialCardinal,
                          String command, String expectedPosition) {

        Assertions.assertEquals(expectedPosition, new RoverController(initialX, initialY, initialDirection(initialCardinal)).execute(command));
    } */

    /*private Rover initialDirection(String cardinal) {
        if (cardinal.equals("N"))
            return new RoverLookingNorth();
        if (cardinal.equals("E"))
            return new RoverLookingEast();
        if (cardinal.equals("S"))
            return new RoverLookingSouth();
        return new RoverLookingWest();
    }*/


}
