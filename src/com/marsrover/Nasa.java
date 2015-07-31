package com.marsrover;

public class Nasa {
    Rover rover;

    public Nasa(Rover rover) {
        this.rover = rover;
    }

    public void launchMission() {
        rover.go("MMMLLLL");
    }
}
