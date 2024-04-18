package com.pluralsight;

public class CellPhone {
    // private variables
    private int serialNumber;
    private String phoneNumber;
    private String model;
    private String carrier;
    private String owner;

    // constructors
    public CellPhone(int serialNumber, String phoneNumber, String model, String carrier, String owner)
    {
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
    }

    public CellPhone()
    {
        this.serialNumber = 0;
        this.phoneNumber = "";
        this.model = "";
        this.carrier = "";
        this.owner = "";

    }

    // accepts a phone number parameter and displays the message
    public void dial(String phoneNumber)
    {
        System.out.println(owner + "'s phone is calling" + phoneNumber);
    }

    // getters and setters for 5 data members
    public int getSerialNumber()
    {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) { this.serialNumber = serialNumber; }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return carrier;
    }
    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getOwner()
    {
        return owner;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }



}

