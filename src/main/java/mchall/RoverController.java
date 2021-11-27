package mchall;

import mchall.commands.CommandFactory;
import mchall.rover.*;

public class RoverController {

    private final int initialX;
    private final int initialY;
    private Rover marsRover;

    public RoverController(int initialX, int initialY, String initialDirection, Terrain terrain){
        this.initialX = initialX;
        this.initialY = initialY;
        this.marsRover = createNewRover(initialDirection, terrain);
    }

    public String executeCommands(String commands) {
        CommandFactory commandFactory;
        String[] allCommands = getCommands(commands);

        for (String command: allCommands) {
            commandFactory = new CommandFactory(this.marsRover);
            this.marsRover = commandFactory.getCommand(command).execute();
        }

        return this.marsRover.currentPosition();
    }

    private Rover createNewRover(String initialDirection, Terrain terrain){
        if (initialDirection.equals("N"))
            return new RoverLookingNorth(initialX, initialY, terrain);
        if (initialDirection.equals("E"))
            return new RoverLookingEast(initialX, initialY, terrain);
        if (initialDirection.equals("S"))
            return new RoverLookingSouth(initialX, initialY, terrain);
        return new RoverLookingWest(initialX, initialY, terrain);
    }
    private String[] getCommands(String commands){
        return commands.split("");
    }
}
