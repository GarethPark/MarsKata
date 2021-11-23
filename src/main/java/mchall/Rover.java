package mchall;

public class Rover {

    private static final String MOVE_COMMAND = "Move" ;
    private int x;
    private int y;
    private final String direction;

    public Rover (int x, int y, String direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public String execute(String commands) {

        String[] allCommands = commands.split("");
        for (String command: allCommands) {
            if (command.equals("N")){
                y++;
            }
            if (command.equals("S")){
                y--;
            }
        }
        return buildReturnValue();
    }
    
    private String buildReturnValue(){
        return this.x + this.y + this.direction;  //TODO - use string builder
    }
}
