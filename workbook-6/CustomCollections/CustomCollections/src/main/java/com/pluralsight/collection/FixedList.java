package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T>
{
    // variables
    private List<T> items = new ArrayList<>();
    private int maxSize;

    // constructor
    public FixedList(int maxSize)
    {
        this.maxSize = maxSize;
    }

    // method to add items
    public void add(T item)
    {
        if(items.size() < maxSize)
        {
            items.add(item);
        } else {
            throw new RuntimeException("Cannot add more items. Maximum size reached. ");
        }
    }

    // method to get items
    public List<T> getItems()
    {
        return items;
    }
}
