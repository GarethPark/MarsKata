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
        int newXCoordinate = x - 1 < 0 ? 0 : x - 1;
        return new RoverLookingWest(newXCoordinate, y, terrain);
    }
}
