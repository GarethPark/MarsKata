package mchall.rover;

import mchall.Terrain;

public class RoverLookingWest extends Rover {

    public RoverLookingWest(int initialX, int initialY, Terrain terrain) {
        super(initialX, initialY, terrain);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingSouth(x, y, terrain);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingNorth(x, y, terrain);
    }
    @Override
    public String currentPosition(){
        return Integer.toString(this.x) + Integer.toString(this.y) + "W";
    }
    @Override
    public Rover move() {
        return new RoverLookingWest(x - 1, y, terrain);
    }
}
