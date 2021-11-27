package mchall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Launcher {
    private String finalOutput="";

    public String launchRovers(String upperRightCoordinates, String commands){

        Terrain terrain = createTerrain(upperRightCoordinates);
        List<String> commandList = createCommandList(commands);
        ListIterator commandIterator = commandList.listIterator();

        while(commandIterator.hasNext()) {
            String initialPosition = commandIterator.next().toString();

            RoverController controller = new RoverController(getInitialX(initialPosition),
                                getInitialY(initialPosition),
                                getInitialDirection(initialPosition),
                                terrain);

            AppendRoverOutputToFinalOutput(controller.executeCommands(commandIterator.next().toString()).trim());
        }
        return finalOutput.trim();
    }
    private List<String> createCommandList(String commands){
        return new ArrayList<String>(Arrays.asList(commands.split(" ")));
    }
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
    private void AppendRoverOutputToFinalOutput(String roverOutput){
        if(this.finalOutput.equals("")){
            this.finalOutput = roverOutput;
        }
        else{
            this.finalOutput+= " " + roverOutput;
        }
    }
}
