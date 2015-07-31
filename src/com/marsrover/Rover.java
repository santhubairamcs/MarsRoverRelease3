package com.marsrover;

public class Rover {
    private int x;
    private int y;
    private char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getFinalPosition() {
        return x + " " + y + " " + direction;
    }

    public void go(String instruction) {
        char instructionChar = instruction.charAt(0);
        if (instructionChar == 'M')
            this.x = this.x + 1;
    }
}
