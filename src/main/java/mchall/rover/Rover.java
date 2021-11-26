package mchall.rover;

public abstract class Rover {
    protected final int x;
    protected final int y;

    public Rover(int initialX, int initialY) {
        System.out.println(("rover con inital x = " + initialX));
        this.x = initialX;
        this.y = initialY;
    }
    public abstract String currentPosition();
    public abstract Rover turnLeft();
    public abstract Rover turnRight();
    public abstract Rover move();

}
