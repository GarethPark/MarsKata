package mchall.commands;
import mchall.rover.Rover;

public class TurnLeftCommand implements Command {
    private Rover rover;

    public TurnLeftCommand(Rover rover){
        this.rover = rover;
    }

    @Override
    public Rover execute(){
        return rover.turnLeft();
    }
}
