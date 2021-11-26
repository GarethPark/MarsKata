package mchall.rover;

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
    public String currentPosition(){
        return this.x + this.y + "N";
    }
    @Override
    public Rover move() {
        return new RoverLookingNorth(x, y + 1);
    }
}
