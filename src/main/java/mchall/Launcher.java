package mchall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Launcher {
    //55 12N LMLMLMLMM 33E MMRMMRMRRM
    public static String processCommands(String upperRightCoordinates, String inputCommands){
        String output="";
        List<String> commandList = new ArrayList<String>(Arrays.asList(inputCommands.split(" ")));
        ListIterator cmdItr = commandList.listIterator();

        while(cmdItr.hasNext()) {
            String initialPosition = cmdItr.next().toString();
            RoverController controller = new RoverController(initialPosition.charAt(0), initialPosition.charAt(1), Character.toString(initialPosition.charAt(2)));
            String finalPosition = controller.execute(cmdItr.next().toString());
            output = output + finalPosition;
        }
        return "TO DO return Array";
    }
}
