package mchall.rover;

public class RoverLookingWest extends Rover {

    public RoverLookingWest(int initialX, int initialY) {
        super(initialX, initialY);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingSouth(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingNorth(x, y);
    }
    @Override
    public String currentPosition(){
        return Integer.toString(this.x) + Integer.toString(this.y) + "W";
    }
    @Override
    public Rover move() {
        return new RoverLookingWest(x - 1, y);
    }
}
