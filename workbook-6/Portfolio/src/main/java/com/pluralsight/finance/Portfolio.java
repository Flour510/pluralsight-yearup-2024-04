package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio
{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset)
    {
        assets.add(asset);
    }

    public double getValue()
    {
       double netValue = 0.0;
       for (Valuable asset : assets)
       {
           netValue += asset.getValue();
       }
       return netValue;
    }

    public Valuable getMostValuable()
    {
        if (assets.isEmpty())
            return null;

        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets)
        {
            if (asset.getValue() > mostValuable.getValue())
            {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable()
    {
        if (assets.isEmpty())
            return null;

        Valuable leastValuable = assets.get(0);
        for (Valuable asset : assets)
        {
            if (asset.getValue() < leastValuable.getValue())
            {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

}
