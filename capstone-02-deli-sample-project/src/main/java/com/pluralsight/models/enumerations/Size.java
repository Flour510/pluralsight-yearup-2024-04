package com.pluralsight.models.enumerations;

public enum Size
{
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String val;

    Size(String val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return val;
    }
}
