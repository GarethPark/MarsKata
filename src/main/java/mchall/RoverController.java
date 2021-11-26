package mchall;

import mchall.commands.CommandFactory;
import mchall.rover.*;

public class RoverController {

    private final int initialX;
    private final int initialY;
    private Rover marsRover;

    public RoverController(int initialX, int initialY, String initialCardinal){
        this.initialX = initialX;
        this.initialY = initialY;
        this.marsRover = createNewRover(initialCardinal);
    }

    public String execute(String commands) {
        CommandFactory commandFactory;
        String[] allCommands = getCommands(commands);

        for (String command: allCommands) {
            System.out.println("execute command " + command);
            commandFactory = new CommandFactory(this.marsRover);
            this.marsRover = commandFactory.commandFrom(command).execute();
            System.out.println("current Pso = " + this.marsRover.currentPosition());
        }

        return this.marsRover.currentPosition();
    }

    private Rover createNewRover(String initialCardinal){
        if (initialCardinal.equals("N"))
            return new RoverLookingNorth(initialX, initialY);
        if (initialCardinal.equals("E"))
            return new RoverLookingEast(initialX, initialY);
        if (initialCardinal.equals("S"))
            return new RoverLookingSouth(initialX, initialY);
        return new RoverLookingWest(initialX, initialY);
    }
    private String[] getCommands(String commands){
        return commands.split("");
    }
}
