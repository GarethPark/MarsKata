package mchall.commands;

import mchall.rover.Rover;

public interface Command {
    Rover execute();
}
