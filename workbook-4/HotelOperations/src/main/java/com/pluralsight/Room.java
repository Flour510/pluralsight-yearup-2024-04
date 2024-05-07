package com.pluralsight;

public class Room
{
    // private variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    // constructors
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable)
    {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    // getters and setters
    public int getNumberOfBeds()
    {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds)
    {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied)
    {
        this.isOccupied = isOccupied;
    }

    public boolean isDirty()
    {
        return isDirty;
    }

    public void setDirty(boolean dirty)
    {
        this.isDirty = dirty;
    }

    public boolean isAvailable()
    {
        boolean isAvailable = !isDirty && !isOccupied ? true : false;
        return isAvailable;
    }


}
