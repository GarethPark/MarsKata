package mchall;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {

    private Launcher launcher = new Launcher();

    @ParameterizedTest
    @CsvSource({
            "55, '12N M', '13N'",
            "55, '12N M 33N MMM', '13N 35N'",
            "55, '12E M 23E MMM', '22E 53E'",
            "55, '32E M 13E MMMM', '42E 53E'",
            "55, '32W M 53W MMM', '22W 23W'",
            "55, '43W M 56W MMM', '33W 26W'",
            "55, '22S M 55S MMM', '21S 52S'",
            "55, '24S M 55S MMMM', '23S 51S'"
    })
    public void moveRover(String upperRightCoordinates, String commands, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, launcher.launchRovers(upperRightCoordinates, commands));
    }

    @ParameterizedTest
    @CsvSource({
            "55, '12N R', '12E'",
            "55, '12N R 33N LLL', '12E 33E'",
            "55, '12E R 33E LLL', '12S 33S'",
            "55, '12E RRR 33E LL', '12N 33W'",
            "55, '12W RRR 33W LL', '12S 33E'",
            "55, '12W RR 33W LRLL', '12E 33E'",
            "55, '12S RL 33S LLRL', '12S 33N'",
            "55, '12S RRL 33S RRRR', '12W 33S'"
    })
    public void turnRover(String upperRightCoordinates, String commands, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, launcher.launchRovers(upperRightCoordinates, commands));
    }

    @ParameterizedTest
    @CsvSource({
            "55, '12N RM', '22E'",
            "55, '12N MR', '13E'",
            "55, '12N RMMR 33N LML', '32S 23S'",
            "55, '12E RM 33E MLL', '11S 43W'",
            "55, '22E MR 13E LMM', '32S 15N'",
            "55, '22W MR 13W LMM', '12N 11S'",
            "55, '33W MR 13W LLMM', '23N 33E'",
            "55, '33S MRM 13S LLMM', '22W 15N'",
            "55, '11S RRM 12S LRLLMMM', '12N 15N'"
    })
    public void moveAndTurnRover(String upperRightCoordinates, String commands, String expectedOutput) {
        Assertions.assertEquals(expectedOutput, launcher.launchRovers(upperRightCoordinates, commands));
    }
}
