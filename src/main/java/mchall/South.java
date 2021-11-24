package mchall;

public class South implements Direction{

    public Direction turnLeft(){
        return new East();
    }
    public Direction turnRight(){
        return new West();
    }
    public String ToString(){
        return "South";
    }
    @Override
    public Rover move(int x, int y) {
        return new Rover(x, y - 1, this);
    }
}
