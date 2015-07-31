package com.marsrover;

public class Rover {
    private final int x;
    private final int y;
    private final char direction;

    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getFinalPosition() {
        return x + " " + y + " " + direction;
    }
}
