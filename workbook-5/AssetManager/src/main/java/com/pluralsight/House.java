package com.pluralsight;

public class House extends Asset
{
    // properties
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    // methods
    // constructors
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize)
    {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getConditionDescription() // is this how you add the condition: int (1 - excellent, 2 - good, 3 - fair, 4 - poor) ?
    {
        switch (condition){
            case 1:
                return "excellent";
            case 2:
                return "good";
            case 3:
                return "fair";
            case 4:
                return "poor";
            default:
                return "unknown";
        }
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    // a houses value is determined as
    public double calculateValue() {

        double valuePerSquareFoot;

        switch (condition)
        {
            case 1:
                valuePerSquareFoot = 180.00;
                break;
            case 2:
                valuePerSquareFoot = 130.00;
                break;
            case 3:
                valuePerSquareFoot = 90.00;
                break;
            case 4:
                valuePerSquareFoot = 80.00;
                break;
            default:
                valuePerSquareFoot = 0.00; // unknown condition
        }
        return (valuePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }

    // override getValue() method from asset class
    @Override
    public double getValue()
    {
        return calculateValue();
    }
}
