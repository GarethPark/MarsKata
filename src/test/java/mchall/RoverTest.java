package mchall;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void returnStartingPositionOfRoverWithoutAnyCommand(){
        final String emptyCommand = "";

        assertEquals(("1 2 N"), new Rover (1,2, "N").execute(emptyCommand));
    }
}
