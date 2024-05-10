package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void checkIn_shouldMakeRoomIsOccupiedAndDirty()
    {
        // arrange
        Room room = new Room(1, 150, false, false);

        // act --> THE ONE action that I am testing
        room.checkIn();

        // assert - verify that the action worked as expected
        boolean isAvailable = room.isAvailable();
        assertFalse(isAvailable);


    }

    @Test
    public void checkOut_shouldMakeRoomIsReadyToBeCleaned()
    {
        // arrange
        Room room = new Room(1, 150, false, true);

        // act --> THE ONE action that I am testing
        boolean

        // assert - verify that the action worked as expected

    }

}