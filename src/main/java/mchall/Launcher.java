package mchall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Launcher {
    //Change method name - it's doing more than 1 thing
    public static String launchRovers(String upperRightCoordinates, String inputCommands){
        String output="";
        List<String> commandList = new ArrayList<String>(Arrays.asList(inputCommands.split(" ")));
        ListIterator cmdItr = commandList.listIterator();

        while(cmdItr.hasNext()) {
            String initialPosition = cmdItr.next().toString();
            System.out.println(initialPosition.charAt(0));
            int initialX = Character.getNumericValue(initialPosition.charAt(0));
            System.out.println("inital x var = " + initialX);
            int initialY = Character.getNumericValue(initialPosition.charAt(1));
            String initialDirection = Character.toString(initialPosition.charAt(2));
            RoverController controller = new RoverController(initialX, initialY, initialDirection);
            String finalPosition = controller.execute(cmdItr.next().toString());
            output = output.trim() + " " + finalPosition.trim();
        }
        return output.trim();
    }
}
