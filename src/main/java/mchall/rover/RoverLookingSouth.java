package mchall.rover;

import mchall.Terrain;

public class RoverLookingSouth extends Rover {

    public RoverLookingSouth(int initialX, int initialY, Terrain terrain) {
        super(initialX,initialY, terrain);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingEast(x, y, terrain);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingWest(x, y, terrain);
    }
    @Override
    public String currentPosition(){
        return Integer.toString(this.x) + Integer.toString(this.y) + "S";
    }
    @Override
    public Rover move() {
        return new RoverLookingSouth(x, y - 1, terrain);
    }
}
