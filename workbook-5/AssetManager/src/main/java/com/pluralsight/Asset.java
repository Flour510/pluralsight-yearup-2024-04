package com.pluralsight;

// base class
public class Asset
{
    // properties
    private String description;
    private String dateAcquired;
    private double originalCost;

    // methods
    //constructor
    public Asset(String description, String dateAcquired, double originalCost)
    {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue()
    {
        return originalCost;
    }

}
