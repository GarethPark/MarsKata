package mchall.rover;

public class RoverLookingNorth extends Rover {

    public RoverLookingNorth(int initialX, int initialY) {
        super(initialX,initialY);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingWest(x, y);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingEast(x, y);
    }
    @Override
    public String currentPosition(){
        System.out.println("this x " + this.x);
        System.out.println("this y " + this.y);
        return Integer.toString(this.x) + Integer.toString(this.y) + "N";
    }
    @Override
    public Rover move() {
        return new RoverLookingNorth(x, y + 1);
    }
}
