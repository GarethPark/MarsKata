package mchall;

//Public at top, private at bottom

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
        String[] allCommands = commands.split("");

        for (String command: allCommands) {
            if (command.equals("M")) {
                this.marsRover = this.marsRover.move();
            }
            if (command.equals("L")){
                this.marsRover = this.marsRover.turnLeft();
            }
            if (command.equals("R")){
                this.marsRover = this.marsRover.turnRight();
            }
        }
        return this.marsRover.toString() ; //TO DO needs method
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
}
