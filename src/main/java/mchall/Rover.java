package mchall;

public class Rover {

    //private static final String MOVE_COMMAND = "Move";
    private int x;
    private int y;
    //private final String cardinal;
    private String cardinal;

    public Rover (int x, int y, String cardinal){
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public String execute(String commands) {

        String[] allCommands = commands.split("");
        for (String command: allCommands) {
            if (command.equals("M")){
                if (facing("N")){
                    y++;
                }
                if (facing("S")){
                    y--;
                }
            }
            if (command.equals("L")){
                this.cardinal = "West";
            }
            if (command.equals("R")){
                this.cardinal = "East";
            }
        }
        return buildReturnValue();
    }

    private boolean facing (String direction){
        return this.cardinal.equals(direction);
    }
    private String buildReturnValue(){
        return this.x + " " + this.y + " " + this.cardinal;  //TODO - use string builder
    }

    private boolean currentDirection(String direction){
        return this.cardinal.equals(direction);
    }
}
