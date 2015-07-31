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
        if (instructionChar == 'M') {
            moveForward();
        }
        else if (instructionChar == 'L') {
            turnLeft();
        }
        else if (instructionChar == 'R') {
            turnRight();
        }
    }

    private void moveForward() {
        if (direction == 'E')
            this.x += 1;
        else if (direction == 'W')
            this.x -= 1;
        else if (direction == 'N')
            this.y += 1;
        else
            this.y -= 1;
    }

    private void turnLeft() {
        if (direction == 'E')
            direction = 'N';
        else if(direction == 'N')
            direction = 'W';
        else if (direction == 'W')
            direction = 'S';
        else
            direction = 'E';
    }

    private void turnRight() {
        if (direction == 'E')
            direction = 'S';
        else if (direction == 'S')
            direction = 'W';
        else if (direction == 'W')
            direction = 'N';
        else
            direction = 'E';
    }
}
