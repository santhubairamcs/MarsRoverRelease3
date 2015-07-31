package com.marsrover;

public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(1, 2, 'E');
        Nasa nasa = new Nasa(rover);
        nasa.launchMission();
        System.out.println(rover.getFinalPosition());
    }
}
