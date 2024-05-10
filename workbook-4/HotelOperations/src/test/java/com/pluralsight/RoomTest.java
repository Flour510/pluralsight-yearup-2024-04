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
        //room.checkIn();
        assertTrue(room.checkIn());

        // assert - verify that the action worked as expected
        //boolean isAvailable = room.isAvailable();
        assertFalse(room.isAvailable());


    }

    @Test
    public void checkOut_shouldMakeRoomIsReadyToBeCleaned()
    {
        // arrange
        Room room = new Room(1, 150, true, true);

        // act --> THE ONE action that I am testing
        assertTrue(room.checkOut());

        // assert - verify that the action worked as expected
        //boolean isAvailable = room.isAvailable();
        assertTrue(room.isAvailable());
    }

}