package mchall;

public class North implements Direction{

    public Direction turnLeft(){
        return new East();
    }
    public Direction turnRight(){
        return new East();
    }
    public String ToString(){
        return "North";
    }
    @Override
    public Rover move(int x, int y) {
        return new Rover(x, y + 1, this);
    }
}
