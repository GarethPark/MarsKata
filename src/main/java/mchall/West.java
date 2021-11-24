package mchall;

public class West implements Direction{

    public Direction turnLeft(){
        return new South();
    }
    public Direction turnRight(){
        return new North();
    }
    public String ToString(){
        return "West";
    }
    @Override
    public Rover move(int x, int y) {
        return new Rover(x - 1 , y, this);
    }
}
