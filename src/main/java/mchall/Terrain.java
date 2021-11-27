package mchall;

public class Terrain {

    private int maxX = 0;
    private int maxY = 0;

    public Terrain(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}