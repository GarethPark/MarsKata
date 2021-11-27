package mchall.rover;

import mchall.Terrain;

public class RoverLookingEast extends Rover {

    public RoverLookingEast(int initialX, int initialY, Terrain terrain) {
        super(initialX,initialY, terrain);
    }
    @Override
    public Rover turnLeft(){
        return new RoverLookingNorth(x, y, terrain);
    }
    @Override
    public Rover turnRight(){
        return new RoverLookingSouth(x, y, terrain);
    }
    @Override
    public String currentPosition(){
        return Integer.toString(this.x) + Integer.toString(this.y) + "E";
    }
    @Override
    public Rover move() {
        return new RoverLookingEast(x+ 1, y, terrain);
    }
}
