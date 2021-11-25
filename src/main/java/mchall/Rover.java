package mchall;


public abstract class Rover {
    protected final int x;
    protected final int y;

    public Rover(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public abstract Rover turnLeft();
    public abstract Rover turnRight();
    public abstract Rover move();
    public abstract String toString();
}
