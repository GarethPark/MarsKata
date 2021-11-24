package mchall;

public interface Direction {
    public Direction turnLeft();
    public Direction turnRight();
    Rover move(int x, int y);
}
