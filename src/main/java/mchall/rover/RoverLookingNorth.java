package mchall.rover;

import mchall.Terrain;

public class RoverLookingNorth extends Rover {

    public RoverLookingNorth(int initialX, int initialY, Terrain terrain) {
        super(initialX,initialY, terrain);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingWest(x, y, terrain);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingEast(x, y, terrain);
    }
    @Override
    public String currentPosition(){
        return Integer.toString(this.x) + Integer.toString(this.y) + "N";
    }
    @Override
    public Rover move() {
        int newYCoordinate = y + 1 > terrain.getMaxY() ? terrain.getMaxY() : y + 1;
        return new RoverLookingNorth(x, newYCoordinate, terrain);
    }
}
