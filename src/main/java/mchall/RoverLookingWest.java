package mchall;

public class RoverLookingWest extends Rover {

    public RoverLookingWest(int initialX, int initialY) {
        super(initialX, initialY);
    }

    public Rover turnLeft(){
        return new RoverLookingSouth(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingNorth(x, y);
    }
    @Override
    public String currentPosition(){
        return this.x + this.y + "W";
    }
    @Override
    public Rover move() {
        return new RoverLookingWest(x - 1, y);
    }
}
