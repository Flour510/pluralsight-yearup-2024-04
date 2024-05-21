package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

public abstract class FixedAsset implements Valuable
{
    private String name;
    private double marketValue;

    public FixedAsset(String name, double marketValue)
    {
        this.name = name;
        this.marketValue = marketValue;
    }

    @Override
    public String getName() { return name; }

    public double getMarketValue() { return marketValue; }

    public void Asset(String name, double value)
    {

    }

    public double getValue()
    {
        return marketValue;
    }
}
