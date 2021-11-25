package mchall;

public class RoverLookingSouth extends Rover {

    public RoverLookingSouth(int initialX, int initialY) {
        super(initialX,initialY);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingEast(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingWest(x, y);
    }
    @Override
    public String currentPosition(){
        return this.x + this.y + "S";
    }
    @Override
    public Rover move() {
        return new RoverLookingSouth(x, y - 1);
    }
}
