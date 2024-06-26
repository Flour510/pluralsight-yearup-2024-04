package com.pluralsight.finance;

public class Jewelry extends FixedAsset
{
    private String name;
    private double karat;

    public Jewelry(String name, double karat)
    {
        super(name, karat);
        this.name = name;
        this.karat = karat;
    }

    @Override
    public double getValue()
    {
        // calculate value by karat
        return 1000;
    }
}
