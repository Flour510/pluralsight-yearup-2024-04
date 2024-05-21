package com.pluralsight;

import com.pluralsight.finance.Gold;
import com.pluralsight.finance.House;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.interfaces.Valuable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("My assets");
        ArrayList<Valuable> valuables = new ArrayList<>();

        valuables.add(new Jewelry("Earrings", 10));
        valuables.add(new Jewelry("Necklace", 15));
        valuables.add(new House("Home", 100, 2023, 500, 2));
        valuables.add(new House("Rental", 150, 2029, 500, 2));
        valuables.add(new Gold("Bracelet", 1500, 7)); // grams of weight
        valuables.add(new Gold("Ring", 500, 3)); // grams of weight

        for (Valuable valuable :  valuables)
        {
            System.out.println(valuable.getName());
            System.out.println(valuable.getValue());
        }
    }
}