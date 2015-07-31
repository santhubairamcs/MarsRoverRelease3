package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldRoverKnowsThatHowToGiveItsFinalPosition() {
        Rover rover = new Rover(1, 2, 'E');

        assertEquals("1 2 E", rover.getFinalPosition());
    }
}
