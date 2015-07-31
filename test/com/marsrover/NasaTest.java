package com.marsrover;

import org.junit.Test;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class NasaTest {

    @Test
    public void shouldKnowsThatTheRoversGoCalledUsingMocks() {
        Rover roverMock = mock(Rover.class);
        Nasa nasa = new Nasa(roverMock);

        nasa.launchMission();
        verify(roverMock, atLeast(1)).go("MMMLLLL");
    }
}