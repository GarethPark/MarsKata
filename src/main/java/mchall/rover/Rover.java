package mchall.rover;

import mchall.Terrain;

public abstract class Rover {
    protected final int x;
    protected final int y;
    protected final Terrain terrain;

    public Rover(int initialX, int initialY, Terrain terrain) {
        this.x = initialX;
        this.y = initialY;
        this.terrain = terrain;
    }
    public abstract String currentPosition();
    public abstract Rover turnLeft();
    public abstract Rover turnRight();
    public abstract Rover move();
}
