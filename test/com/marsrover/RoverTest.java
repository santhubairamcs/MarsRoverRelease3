package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldRoverKnowsThatHowToGiveItsFinalPosition() {
        Rover rover = new Rover(1, 2, 'E');

        assertEquals("1 2 E", rover.getFinalPosition());
    }

    @Test
    public void shouldRoverKnowsThatHowToMoveWhenItIsFacingEast() {
        Rover rover = new Rover(1, 2, 'E');

        rover.go("M");

        assertEquals("2 2 E", rover.getFinalPosition());
    }

    @Test
    public void shouldRoverKnowsThatHowToMoveWhenItIsFacingWest() {
        Rover rover = new Rover(1, 2, 'W');

        rover.go("M");

        assertEquals("0 2 W", rover.getFinalPosition());
    }

    @Test
    public void shouldRoverKnowsThatHowToMoveWhenItIsFacingNorth() {
        Rover rover = new Rover(1, 2, 'N');

        rover.go("M");

        assertEquals("1 3 N", rover.getFinalPosition());
    }

    @Test
         public void shouldRoverKnowsThatHowToMoveWhenItIsFacingSouth() {
        Rover rover = new Rover(1, 2, 'S');

        rover.go("M");

        assertEquals("1 1 S", rover.getFinalPosition());
    }

    @Test
    public void shouldRoverKnowsThatHowToTurnLeftWhenItIsFacingEast() {
        Rover rover = new Rover(1, 2, 'E');

        rover.go("L");

        assertEquals("1 2 N", rover.getFinalPosition());
    }
}
