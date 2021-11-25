package mchall;

public class RoverLookingEast extends Rover {

    public RoverLookingEast(int initialX, int initialY) {
        super(initialX,initialY);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingNorth(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingSouth(x, y);
    }
    @Override
    public String currentPosition(){
        return this.x + this.y + "E";
    }
    @Override
    public Rover move() {
        return new RoverLookingEast(x+ 1, y);
    }
}
