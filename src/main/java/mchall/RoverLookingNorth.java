package mchall;

public class RoverLookingNorth extends Rover {

    public RoverLookingNorth(int initialX, int initialY) {
        super(initialX,initialY);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingEast(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingEast(x, y);
    }
    @Override
    public String toString(){
        return "East";
    }
    @Override
    public Rover move() {
        return new RoverLookingNorth(x, y + 1);
    }
}
