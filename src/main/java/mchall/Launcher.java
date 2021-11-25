package mchall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Launcher {
    //55 12N LMLMLMLMM 33E MMRMMRMRRM
    public static String processCommands(String upperRightCoordinates, String inputCommands){

        List<String> commandList = new ArrayList<String>(Arrays.asList(inputCommands.split(" ")));
        ListIterator cmdItr = commandList.listIterator();

        while(cmdItr.hasNext()) {
            String initalPosition = cmdItr.next().toString();
            RoverController controller = new RoverController()
            System.out.println(cmdItr.next());
        }


        //Create new RoverController (context) with initial position
        // pass commands and commands that do concrete state
        //Execute Commands
        //Add to array
    }
}
