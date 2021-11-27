package mchall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Launcher {
    //Change method name - it's doing more than 1 thing - what does it actually do?
    public String launchRovers(String upperRightCoordinates, String commands){
        String output=""; //change this name

        Terrain terrain = createTerrain(upperRightCoordinates);
        List<String> commandList = createCommandList(commands);
        ListIterator cmdItr = commandList.listIterator();

        while(cmdItr.hasNext()) {
            String initialPosition = cmdItr.next().toString();

            int initialX = getInitialX(initialPosition);
            int initialY = getInitialY(initialPosition);
            String initialDirection = getInitialDirection(initialPosition);

            RoverController controller = new RoverController(initialX, initialY, initialDirection, terrain);
            output = output.trim() + " " + controller.executeCommands(cmdItr.next().toString()).trim();
        }
        return output.trim();
    }
    private List<String> createCommandList(String commands){
        return new ArrayList<String>(Arrays.asList(commands.split(" ")));
    }
    //Make names more generic
    private int getInitialX(String initialPosition){
        return Character.getNumericValue(initialPosition.charAt(0));
    }
    private int getInitialY(String initialPosition){
        return Character.getNumericValue(initialPosition.charAt(1));
    }
    private String getInitialDirection(String initialPosition){
        return Character.toString(initialPosition.charAt(2));
    }
    private Terrain createTerrain(String  upperRightCoordinates){
        return new Terrain(this.getInitialX(upperRightCoordinates), this.getInitialY(upperRightCoordinates));
    }
}
