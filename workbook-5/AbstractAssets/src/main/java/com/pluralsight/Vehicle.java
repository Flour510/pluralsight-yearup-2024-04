package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset
{
    //properties
    private String makeModel;
    private int year;
    private int odometer;

    // constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
    }

    // getters and setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // a cars value is determined as
    public double calculateValue()
    {
        double adjustedValue = getOriginalCost();
        int currentYear = Year.now().getValue();
        int age = currentYear - year;

        if (age >= 0 && age <= 3)
        {
            double reductionPercentage = 0.03 * age; // 3% reduced value per year
            adjustedValue -= adjustedValue * reductionPercentage;
        } else if (age >= 4 && age <= 6)
        {
            double reductionPercentage = 0.06 * age; // 6% reduced value per year
            adjustedValue -= adjustedValue * reductionPercentage;
        } else if (age >= 7 && age <= 10)
        {
            double reductionPercentage = 0.08 * age; // 8% reduced value per year
            adjustedValue -= adjustedValue * reductionPercentage;
        } else if (age > 10)
        {
            adjustedValue -= 1000; // value reduced by $1000 if older than 10 years
        }

        // if over 100000 miles reduce final value by 25%
        if (odometer > 100000 & !(makeModel.contains("Honda") || makeModel.contains("Toyota")))
        {
            adjustedValue *= 0.75;
        }

        return (adjustedValue);
    }

    // override getValue() method from asset class
    @Override
    public double getValue()
    {
        return calculateValue();
    }
}
