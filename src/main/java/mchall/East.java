package mchall;

public class East implements Direction{

    public Direction turnLeft(){
        return new North();
    }
    public Direction turnRight(){
        return new South();
    }
    public String ToString(){
        return "East";
    }
    @Override
    public Rover move(int x, int y) {
        return new Rover(x + 1 , y, this);
    }
}
