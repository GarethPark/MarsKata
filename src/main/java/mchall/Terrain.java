package mchall;

public class Terrain {

    private int maximumX = 0;
    private int maximumY = 0;

    public Terrain(int maximumX, int maximumY) {
        this.maximumX = maximumX;
        this.maximumY = maximumY;
    }

    public int getMaximumX() {
        return maximumX;
    }

    public int getMaximumY() {
        return maximumY;
    }
}