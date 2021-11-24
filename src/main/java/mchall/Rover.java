package mchall;

//Public at top, private at bottom

public class Rover {

    private int x;
    private int y;
    //private String cardinal;
    private Direction cardinal;

    public Rover (int x, int y, Direction cardinal){
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public String execute(String commands) {

        String[] allCommands = commands.split("");
        for (String command: allCommands) {
            if (command.equals("M")) {
                if (facing("N")) {
                    y++;
                }
                if (facing("S")) {
                    y--;
                }
            }
            if (isCardinalCommand(command)) {
                this.processCardinalCommand(command);
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
    private void processCardinalCommand(String command){
        if (command.equals("L")){
            this.cardinal = this.cardinal.turnLeft();
        }
        if (command.equals("R")){
            this.cardinal = this.cardinal.turnRight();
        }
    }
    private Boolean isCardinalCommand(String command){
        return (command == "L" || command == "R");
    }
}
