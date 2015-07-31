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
}
