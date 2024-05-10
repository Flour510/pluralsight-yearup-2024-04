package com.pluralsight;

public class Room
{
    // private variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    // constructors
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
    {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    // getters and setters
    public int getNumberOfBeds() // no setter necessary because number of beds will not be changing
    {
        return numberOfBeds;
    }

    public double getPrice() // no setter necessary because price will not be changing
    {
        return price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }

    public boolean isAvailable()
    {
        return !isOccupied && !isDirty;
    }

    public boolean checkIn()
    {
       if(this.isAvailable()){
           this.isDirty = true;
           this.isOccupied = true;
           return true;
       }
        return false;
    }

    public boolean checkOut()
    {
       if(cleanRoom()){
          this.isOccupied = false;
          return true;
       }
       return false;
    }

    public boolean cleanRoom()
    {
        this.isDirty = false;
        return true;

    }

}
