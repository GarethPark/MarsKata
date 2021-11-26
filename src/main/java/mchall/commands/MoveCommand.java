package mchall.commands;
import mchall.rover.Rover;

public class MoveCommand implements Command {
    private final Rover rover;
    public MoveCommand(Rover rover){
        this.rover = rover;
    }

    @Override
    public Rover execute(){
        return rover.move();
    }
}
